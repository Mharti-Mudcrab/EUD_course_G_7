package dk.sdu.bdd.xtext.web.services;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import java.io.*;

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
            String versionFileName = requestJson.getString("versionFileName");

            // Validate the version filename
            if (versionFileName == null || versionFileName.trim().isEmpty()) {
                throw new IllegalArgumentException("Version filename cannot be empty");
            }

            // Get the WebRoot path
            String webRootPath = getServletContext().getRealPath("/");
            
            // Construct paths using WebRoot
            File scenarioFile = new File(webRootPath, "scenarios/" + versionFileName);
            File targetFile = new File(webRootPath, "../../dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/sample.bdd");
            String absoluteTargetPath = targetFile.getCanonicalPath();

            // Initialize version control with WebRoot path
            VersionControl versionControl = new VersionControl(webRootPath);

            if (!scenarioFile.exists()) {
                throw new FileNotFoundException("Version file not found: " + versionFileName);
            }

            // Perform the revert operation
            versionControl.revertToVersion(versionFileName, absoluteTargetPath);

            // Load the reverted content
            String revertedContent = versionControl.loadVersion(versionFileName);

            responseJson.put("status", "success");
            responseJson.put("message", "Successfully reverted to version: " + versionFileName);
            responseJson.put("content", revertedContent);
            
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

    // Helper method to validate file path is within allowed directory
    private boolean isValidFilePath(File file, File baseDir) throws IOException {
        String canonicalBasePath = baseDir.getCanonicalPath();
        String canonicalTargetPath = file.getCanonicalPath();
        return canonicalTargetPath.startsWith(canonicalBasePath);
    }
}