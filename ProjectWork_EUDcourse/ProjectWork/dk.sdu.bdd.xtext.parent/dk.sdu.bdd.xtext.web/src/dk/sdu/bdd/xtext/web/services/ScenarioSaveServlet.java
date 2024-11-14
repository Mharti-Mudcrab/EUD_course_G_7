package dk.sdu.bdd.xtext.web.services;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import org.json.JSONObject;

@WebServlet("/save-scenario")
public class ScenarioSaveServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = request.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }

        String extractedContent;
        JSONObject metadata = new JSONObject();
        try {
            JSONObject jsonObject = new JSONObject(content.toString());
            extractedContent = jsonObject.getString("content");
            if (jsonObject.has("metadata")) {
                metadata = jsonObject.getJSONObject("metadata");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("Invalid JSON format");
            return;
        }

        String rootPath = getServletContext().getRealPath("/");
        String relativePath = "../../dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/sample.bdd";
        String absoluteFilePath = new File(rootPath, relativePath).getCanonicalPath();

        // Initialize version control
        VersionControl versionControl = new VersionControl(rootPath);

        try {
            // Save the version
            String versionFileName = versionControl.saveVersion(extractedContent, absoluteFilePath, metadata);

            // Save to the original file
            try (FileWriter fileWriter = new FileWriter(absoluteFilePath)) {
                fileWriter.write(extractedContent);
            }

            // Send success response with version info
            JSONObject responseJson = new JSONObject();
            responseJson.put("status", "success");
            responseJson.put("message", "Scenario saved successfully");
            responseJson.put("version", versionFileName);
            
            response.setStatus(HttpServletResponse.SC_OK);
            response.setContentType("application/json");
            response.getWriter().write(responseJson.toString());
        } catch (IOException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("Error saving scenario: " + e.getMessage());
        }
    }
}