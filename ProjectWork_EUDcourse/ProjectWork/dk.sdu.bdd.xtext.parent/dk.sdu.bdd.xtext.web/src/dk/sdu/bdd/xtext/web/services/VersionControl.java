package dk.sdu.bdd.xtext.web.services;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import org.json.JSONObject;

class VersionControl {
    private static final String VERSION_DIR = "versions";
    private static final String SCENARIO_DIR = "scenarios";
    private static final String METADATA_DIR = "metadata";
    private static final int MAX_VERSIONS = 50;

    private final String rootPath;

    public VersionControl(String rootPath) {
        this.rootPath = rootPath;
        initializeDirectories();
    }

    private void initializeDirectories() {
        for (String dir : new String[]{VERSION_DIR, SCENARIO_DIR, METADATA_DIR}) {
            File directory = new File(rootPath, dir);
            if (!directory.exists()) {
                directory.mkdirs();
            }
        }
    }

    public String saveVersion(String content, String originalFilePath, JSONObject metadata) throws IOException {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        String versionFileName = "scenario-" + timestamp + ".bdd";
        File versionFile = new File(new File(rootPath, SCENARIO_DIR), versionFileName);

        // Save the content
        try (FileWriter writer = new FileWriter(versionFile)) {
            writer.write(content);
        }

        // Save metadata
        if (metadata == null) {
            metadata = new JSONObject();
        }
        metadata.put("timestamp", timestamp);
        metadata.put("originalFile", originalFilePath);
        metadata.put("createdAt", LocalDateTime.now().toString());

        File metadataFile = new File(new File(rootPath, METADATA_DIR), versionFileName + ".json");
        try (FileWriter writer = new FileWriter(metadataFile)) {
            writer.write(metadata.toString(2));
        }

        cleanupOldVersions();
        return versionFileName;
    }

    private void cleanupOldVersions() throws IOException {
        File scenarioDir = new File(rootPath, SCENARIO_DIR);
        File[] versions = scenarioDir.listFiles((dir, name) -> name.endsWith(".bdd"));
        if (versions != null && versions.length > MAX_VERSIONS) {
            Arrays.sort(versions, Comparator.comparing(File::lastModified));
            for (int i = 0; i < versions.length - MAX_VERSIONS; i++) {
                File versionFile = versions[i];
                File metadataFile = new File(new File(rootPath, METADATA_DIR), 
                                           versionFile.getName() + ".json");
                versionFile.delete();
                if (metadataFile.exists()) {
                    metadataFile.delete();
                }
            }
        }
    }

    public List<JSONObject> listVersions() throws IOException {
        List<JSONObject> versions = new ArrayList<>();
        File scenarioDir = new File(rootPath, SCENARIO_DIR);
        File[] versionFiles = scenarioDir.listFiles((dir, name) -> name.endsWith(".bdd"));
        
        if (versionFiles != null) {
            for (File file : versionFiles) {
                JSONObject versionInfo = new JSONObject();
                versionInfo.put("filename", file.getName());
                versionInfo.put("lastModified", new Date(file.lastModified()).toString());
                
                // Load metadata if exists
                File metadataFile = new File(new File(rootPath, METADATA_DIR), 
                                           file.getName() + ".json");
                if (metadataFile.exists()) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(metadataFile))) {
                        StringBuilder content = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            content.append(line);
                        }
                        JSONObject metadata = new JSONObject(content.toString());
                        versionInfo.put("metadata", metadata);
                    }
                }
                versions.add(versionInfo);
            }
        }
        
        versions.sort((v1, v2) -> v2.getString("lastModified")
                                   .compareTo(v1.getString("lastModified")));
        return versions;
    }

    public String loadVersion(String versionFileName) throws IOException {
        File versionFile = new File(new File(rootPath, SCENARIO_DIR), versionFileName);
        if (!versionFile.exists()) {
            throw new FileNotFoundException("Version not found: " + versionFileName);
        }

        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(versionFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public void revertToVersion(String versionFileName, String targetFilePath) throws IOException {
        // Load the version content
        String versionContent = loadVersion(versionFileName);
        // Create backup of current state
        File targetFile = new File(targetFilePath);
        if (targetFile.exists()) {
            StringBuilder currentContent = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(targetFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    currentContent.append(line).append("\n");
                }
            }
            
            JSONObject backupMetadata = new JSONObject();
            backupMetadata.put("type", "backup_before_revert");
            backupMetadata.put("revertedTo", versionFileName);
            saveVersion(currentContent.toString(), targetFilePath, backupMetadata);
        }

        // Write the version content to the target file
        try (FileWriter writer = new FileWriter(targetFile)) {
            writer.write(versionContent);
        }
    }
}