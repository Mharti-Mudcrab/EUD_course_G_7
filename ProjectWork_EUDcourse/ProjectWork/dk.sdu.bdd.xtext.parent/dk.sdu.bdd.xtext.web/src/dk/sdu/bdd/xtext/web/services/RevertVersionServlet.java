package dk.sdu.bdd.xtext.web.services;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import java.io.*;
import java.util.Map;

@WebServlet("/revert-version")
public class RevertVersionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        JSONObject responseJson = new JSONObject();

        try {
            // Read the request body
            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = request.getReader()) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line);
                }
            }

            // Parse the JSON request
            JSONObject requestJson = new JSONObject(content.toString());
            String versionFolderName = requestJson.getString("versionFileName");

            // Validate the version folder name
            if (versionFolderName == null || versionFolderName.trim().isEmpty()) {
                throw new IllegalArgumentException("Version folder name cannot be empty");
            }

            // Get the WebRoot path
            String webRootPath = getServletContext().getRealPath("/");

            // Paths to the target files
            String relativeScenarioPath = "../../dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/sample.bdd";
            String absoluteScenarioFilePath = new File(webRootPath, relativeScenarioPath).getCanonicalPath();

            String relativeEntitiesPath = "../../dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/robotic_domain.bdd";
            String absoluteEntitiesFilePath = new File(webRootPath, relativeEntitiesPath).getCanonicalPath();

            // Initialize version control with WebRoot path
            VersionControl versionControl = new VersionControl(webRootPath);

            // Perform the revert operation
            versionControl.revertToVersion(versionFolderName, absoluteScenarioFilePath, absoluteEntitiesFilePath);

            // Load the reverted contents including metadata
            Map<String, Object> revertedContents = versionControl.loadVersion(versionFolderName);

            responseJson.put("status", "success");
            responseJson.put("message", "Successfully reverted to version: " + versionFolderName);
            responseJson.put("contentScenario", revertedContents.get("contentScenario"));
            responseJson.put("contentEntities", revertedContents.get("contentEntities"));
            responseJson.put("metadata", revertedContents.get("metadata")); // Include metadata

            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().write(responseJson.toString());

        } catch (FileNotFoundException e) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseJson.put("status", "error");
            responseJson.put("message", "Version not found: " + e.getMessage());
            response.getWriter().write(responseJson.toString());

        } catch (IllegalArgumentException e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseJson.put("status", "error");
            responseJson.put("message", e.getMessage());
            response.getWriter().write(responseJson.toString());

        } catch (Exception e) {
            e.printStackTrace(); // Log the full stack trace
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            responseJson.put("status", "error");
            responseJson.put("message", "Internal server error: " + e.getMessage());
            responseJson.put("details", e.toString()); // Include more error details
            response.getWriter().write(responseJson.toString());
        }
    }
}
