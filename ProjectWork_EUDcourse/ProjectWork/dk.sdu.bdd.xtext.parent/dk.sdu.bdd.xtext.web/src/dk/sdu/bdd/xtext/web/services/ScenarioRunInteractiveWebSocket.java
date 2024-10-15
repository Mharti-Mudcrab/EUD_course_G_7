package dk.sdu.bdd.xtext.web.services;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

import java.io.*;

@WebSocket
public class ScenarioRunInteractiveWebSocket {

    private Process pythonProcess;
    private BufferedWriter pythonInputWriter;
    private BufferedReader pythonOutputReader;
    private Session session;

    @OnWebSocketConnect
    public void onConnect(Session session) {
        this.session = session;
        try {
            // Get the root path and construct the path to the Python script
            String rootPath = new File("").getAbsolutePath();
            String relativePath = "../../dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/features/main.py";
            String absoluteFilePath = new File(rootPath, relativePath).getCanonicalPath();

            // Start the Python process
            ProcessBuilder pb = new ProcessBuilder("python", absoluteFilePath); // Path to your script
            pb.redirectErrorStream(true); // Combine stderr and stdout
            pythonProcess = pb.start();

            // Get input and output streams for communication with the Python process
            pythonInputWriter = new BufferedWriter(new OutputStreamWriter(pythonProcess.getOutputStream()));
            pythonOutputReader = new BufferedReader(new InputStreamReader(pythonProcess.getInputStream()));

            // Start a thread to read the Python process output and send it to the WebSocket client
            new Thread(() -> {
                try {
                    String line;
                    while ((line = pythonOutputReader.readLine()) != null) {
                        session.getRemote().sendString(line); // Send output to the frontend
                    }
                } catch (IOException e) {
                    e.printStackTrace(); // Log or handle the error
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace(); // Handle the error and possibly close the session
        }
    }

    @OnWebSocketMessage
    public void onMessage(String message) {
        try {
            // Send the received WebSocket message to the Python process
            pythonInputWriter.write(message);
            pythonInputWriter.newLine(); // Ensure the message is complete
            pythonInputWriter.flush();   // Flush to send immediately
        } catch (IOException e) {
            e.printStackTrace(); // Handle the error (e.g., log the error)
        }
    }

    @OnWebSocketClose
    public void onClose(int statusCode, String reason) {
        try {
            // Close resources and stop the Python process
            if (pythonInputWriter != null) pythonInputWriter.close();
            if (pythonOutputReader != null) pythonOutputReader.close();
            if (pythonProcess != null) pythonProcess.destroy(); // Terminate the Python process
        } catch (IOException e) {
            e.printStackTrace(); // Log or handle the error
        }
    }

    // Add error handling for WebSocket errors
    @OnWebSocketError
    public void onError(Session session, Throwable error) {
        System.err.println("WebSocket error occurred: " + error.getMessage());
        error.printStackTrace(); // Print the stack trace for debugging

        // Optionally, you can notify the client about the error
        if ( session.isOpen() ) {
	        try {
	            session.getRemote().sendString("Error: " + error.getMessage());
	        } catch (IOException e) {
	            e.printStackTrace(); // Log the error if unable to send message to client
	        }
        }
    }
}
