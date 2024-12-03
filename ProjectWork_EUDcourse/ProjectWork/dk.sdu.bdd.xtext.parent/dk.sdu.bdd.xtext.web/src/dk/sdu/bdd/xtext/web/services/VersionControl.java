package dk.sdu.bdd.xtext.web.services;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import org.json.JSONObject;

class VersionControl {
    private static final String VERSION_DIR = "versions";
    private static final int MAX_VERSIONS = 50;

    private final String rootPath;

    public VersionControl(String rootPath) {
        this.rootPath = rootPath;
        initializeDirectories();
    }

    private void initializeDirectories() {
        File versionDir = new File(rootPath, VERSION_DIR);
        if (!versionDir.exists()) {
            versionDir.mkdirs();
        }
    }

    public String saveVersion(String contentScenario, String contentEntities, String originalScenarioFilePath, String originalEntitiesFilePath, JSONObject metadata) throws IOException {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        String versionFolderName = "version-" + timestamp;
        File versionFolder = new File(new File(rootPath, VERSION_DIR), versionFolderName);

        // Create the version folder
        if (!versionFolder.exists()) {
            versionFolder.mkdirs();
        }

        // Save scenario content
        File scenarioFile = new File(versionFolder, "scenario.bdd");
        try (FileWriter writer = new FileWriter(scenarioFile)) {
            writer.write(contentScenario);
        }

        // Save entities content
        File entitiesFile = new File(versionFolder, "entities.bdd");
        try (FileWriter writer = new FileWriter(entitiesFile)) {
            writer.write(contentEntities);
        }

        // Save metadata
        if (metadata == null) {
            metadata = new JSONObject();
        }
        metadata.put("timestamp", timestamp);
        metadata.put("originalScenarioFile", originalScenarioFilePath);
        metadata.put("originalEntitiesFile", originalEntitiesFilePath);
        metadata.put("createdAt", LocalDateTime.now().toString());

        File metadataFile = new File(versionFolder, "metadata.json");
        try (FileWriter writer = new FileWriter(metadataFile)) {
            writer.write(metadata.toString(2));
        }

        cleanupOldVersions();
        return versionFolderName;
    }

    private void cleanupOldVersions() throws IOException {
        File versionDir = new File(rootPath, VERSION_DIR);
        File[] versions = versionDir.listFiles(File::isDirectory);
        if (versions != null && versions.length > MAX_VERSIONS) {
            Arrays.sort(versions, Comparator.comparing(File::lastModified));
            for (int i = 0; i < versions.length - MAX_VERSIONS; i++) {
                File versionFolder = versions[i];
                deleteDirectory(versionFolder);
            }
        }
    }

    public List<JSONObject> listVersions() throws IOException {
        List<JSONObject> versions = new ArrayList<>();
        File versionDir = new File(rootPath, VERSION_DIR);
        File[] versionFolders = versionDir.listFiles(File::isDirectory);
        
        if (versionFolders != null) {
            for (File folder : versionFolders) {
                JSONObject versionInfo = new JSONObject();
                versionInfo.put("folderName", folder.getName());
                versionInfo.put("lastModified", new Date(folder.lastModified()).toString());
                
                // Load metadata if exists
                File metadataFile = new File(folder, "metadata.json");
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

    public Map<String, Object> loadVersion(String versionFolderName) throws IOException {
        File versionFolder = new File(new File(rootPath, VERSION_DIR), versionFolderName);
        if (!versionFolder.exists()) {
            throw new FileNotFoundException("Version not found: " + versionFolderName);
        }

        Map<String, Object> contents = new HashMap<>();

        // Load scenario content
        File scenarioFile = new File(versionFolder, "scenario.bdd");
        if (scenarioFile.exists()) {
            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(scenarioFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }
            contents.put("contentScenario", content.toString());
        }

        // Load entities content
        File entitiesFile = new File(versionFolder, "entities.bdd");
        if (entitiesFile.exists()) {
            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(entitiesFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }
            contents.put("contentEntities", content.toString());
        }

        // Load metadata
        File metadataFile = new File(versionFolder, "metadata.json");
        if (metadataFile.exists()) {
            StringBuilder metadataContent = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(metadataFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    metadataContent.append(line);
                }
            }
            JSONObject metadata = new JSONObject(metadataContent.toString());
            contents.put("metadata", metadata);
        }

        return contents;
    }

    public void revertToVersion(String versionFolderName, String targetScenarioFilePath, String targetEntitiesFilePath) throws IOException {
        Map<String, Object> versionContents = loadVersion(versionFolderName);

        if (versionContents.containsKey("contentScenario")) {
            String contentScenario = (String) versionContents.get("contentScenario");
            try (FileWriter writer = new FileWriter(new File(targetScenarioFilePath))) {
                writer.write(contentScenario);
            }
        }

        // Write the entities content to the target file
        if (versionContents.containsKey("contentEntities")) {
            String contentEntities = (String) versionContents.get("contentEntities");
            try (FileWriter writer = new FileWriter(new File(targetEntitiesFilePath))) {
                writer.write(contentEntities);
            }
        }
    }
    
    public void deleteVersion(String versionFolderName) throws IOException {
        File versionDir = new File(rootPath, VERSION_DIR);
        File versionFolder = new File(versionDir, versionFolderName);

        if (!versionFolder.exists() || !versionFolder.isDirectory()) {
            throw new FileNotFoundException("Version not found: " + versionFolderName);
        }

        // Delete the version folder and its contents
        deleteDirectory(versionFolder);
    }

    private void deleteDirectory(File dir) throws IOException {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) { // Check if not null
                for (File file : files) {
                    deleteDirectory(file);
                }
            }
        }
        if (!dir.delete()) {
            throw new IOException("Failed to delete: " + dir.getAbsolutePath());
        }
    }

}
