package dk.sdu.bdd.xtext.web.services;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@WebServlet("/chat")
public class ChatGptServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String OPENAI_API_URL = "https://api.openai.com/v1/chat/completions";
    private static final String OPENAI_API_KEY = "SECRET!"; // Replace with your API key

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Read the incoming JSON payload
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = request.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }

        JSONObject inputJson;
        String prompt;
        try {
            inputJson = new JSONObject(content.toString());
            prompt = inputJson.getString("prompt");
        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("Invalid JSON format");
            return;
        }

        try {
            // Call the OpenAI API
            String chatResponse = callOpenAiApi(prompt);

            // Prepare the response JSON
            JSONObject responseJson = new JSONObject();
            responseJson.put("status", "success");
            responseJson.put("response", chatResponse);

            response.setStatus(HttpServletResponse.SC_OK);
            response.setContentType("application/json");
            response.getWriter().write(responseJson.toString());
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("Error processing request: " + e.getMessage());
        }
    }

    private String callOpenAiApi(String prompt) throws IOException {
        // Create the JSON request payload
        JSONObject requestBody = new JSONObject();
        requestBody.put("model", "gpt-3.5-turbo");
        requestBody.put("messages", new JSONObject[] {
            new JSONObject().put("role", "user").put("content", prompt)
        });

        // Set up the connection
        URL url = new URL(OPENAI_API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Authorization", "Bearer " + OPENAI_API_KEY);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        // Write the JSON payload to the request body
        try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
            outputStream.writeBytes(requestBody.toString());
            outputStream.flush();
        }

        // Read the response
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                // Parse the response and extract the message
                JSONObject responseJson = new JSONObject(response.toString());
                return responseJson.getJSONArray("choices").getJSONObject(0).getJSONObject("message").getString("content");
            }
        } else {
            throw new IOException("Failed to call OpenAI API: HTTP code " + responseCode);
        }
    }
}
