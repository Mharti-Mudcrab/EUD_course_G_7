package dk.sdu.bdd.xtext.web.services;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.*;

@ServerEndpoint("/run-scenario-interactive")
public class ScenarioRunInteractiveEndpoint {

    private Process pythonProcess;
    private BufferedWriter pythonInputWriter;
    private BufferedReader pythonOutputReader;
    private Session session;

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        try {
        	// Construct the path to the Python script
        	String rootPath = new File("").getAbsolutePath();
            String relativePath = "../../dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/features/main.py";
            String absoluteFilePath = new File(rootPath, relativePath).getCanonicalPath();
        	
            // Start the Python process
            ProcessBuilder pb = new ProcessBuilder("python", absoluteFilePath); // Path to your script
            pb.redirectErrorStream(true); // Combine stderr and stdout
            pythonProcess = pb.start();

            // Get input and output streams
            pythonInputWriter = new BufferedWriter(new OutputStreamWriter(pythonProcess.getOutputStream()));
            pythonOutputReader = new BufferedReader(new InputStreamReader(pythonProcess.getInputStream()));

            // Start a thread to read Python output and send to the frontend
            new Thread(() -> {
                try {
                    String line;
                    while ((line = pythonOutputReader.readLine()) != null) {
                        session.getBasicRemote().sendText(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace(); // Handle error (e.g., send error to client)
                }
            }).start();



        } catch (IOException e) {
            e.printStackTrace(); // Handle error (e.g., close the session)

        }
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        try {
            // Send the message from the frontend to the Python process
            pythonInputWriter.write(message);
            pythonInputWriter.newLine(); // Important: add a newline character
            pythonInputWriter.flush();  // Ensure data is sent immediately


        } catch (IOException e) {
            e.printStackTrace(); // Handle errors (e.g., send error to client)
        }
    }

    @OnClose
    public void onClose(Session session) {
        try {
            if (pythonInputWriter != null) pythonInputWriter.close();
            if (pythonOutputReader != null) pythonOutputReader.close();
            if (pythonProcess != null) pythonProcess.destroy(); // Terminate the Python process
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ... other lifecycle methods (@OnError) ...

}