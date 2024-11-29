package dk.sdu.bdd.xtext.web.services;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import java.io.*;

@WebServlet("/save-both")
public class SaveBothServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Read the request body
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = request.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }

        // Parse JSON request
        String contentScenario;
        String contentEntities;
        JSONObject metadata = new JSONObject();
        try {
            JSONObject jsonObject = new JSONObject(content.toString());
            contentScenario = jsonObject.getString("contentScenario");
            contentEntities = jsonObject.getString("contentEntities");
            if (jsonObject.has("metadata") && jsonObject.get("metadata") instanceof JSONObject) {
                metadata = jsonObject.getJSONObject("metadata");
            } else {
                metadata = new JSONObject(); // Default to an empty object if metadata is missing or invalid
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("Invalid JSON format or metadata is not a JSONObject");
            return;
        }

        String rootPath = getServletContext().getRealPath("/");

        // Paths to the original files
        String relativeScenarioPath = "../../dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/sample.bdd";
        String absoluteScenarioFilePath = new File(rootPath, relativeScenarioPath).getCanonicalPath();

        String relativeEntitiesPath = "../../dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/robotic_domain.bdd";
        String absoluteEntitiesFilePath = new File(rootPath, relativeEntitiesPath).getCanonicalPath();

        // Initialize version control
        VersionControl versionControl = new VersionControl(rootPath);

        try {
            // Save the version
            String versionFolderName = versionControl.saveVersion(
                contentScenario, contentEntities,
                absoluteScenarioFilePath, absoluteEntitiesFilePath, metadata
            );

            // Save to the original files
            try (FileWriter fileWriter = new FileWriter(absoluteScenarioFilePath)) {
                fileWriter.write(contentScenario);
            }
            try (FileWriter fileWriter = new FileWriter(absoluteEntitiesFilePath)) {
                fileWriter.write(contentEntities);
            }

            // Send success response with version info
            JSONObject responseJson = new JSONObject();
            responseJson.put("status", "success");
            responseJson.put("message", "Scenario and Entities saved successfully");
            responseJson.put("version", versionFolderName);
            
            response.setStatus(HttpServletResponse.SC_OK);
            response.setContentType("application/json");
            response.getWriter().write(responseJson.toString());
        } catch (IOException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("Error saving scenario and entities: " + e.getMessage());
        }
    }
}

