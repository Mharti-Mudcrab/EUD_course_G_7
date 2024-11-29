package dk.sdu.bdd.xtext.web.services;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.*;
import java.io.*;

@WebSocket
public class DebugWebSocketHandler {
    private Process pythonProcess;
    private BufferedWriter pythonInputWriter;
    private BufferedReader pythonOutputReader;
	private Session session;
    

    @OnWebSocketConnect
    public void onConnect(Session session) {
        this.session = session;
        try {
            ProcessBuilder pb = new ProcessBuilder("python",  "--debug");
            pb.redirectErrorStream(true);
            pythonProcess = pb.start();

            pythonInputWriter = new BufferedWriter(new OutputStreamWriter(pythonProcess.getOutputStream()));
            pythonOutputReader = new BufferedReader(new InputStreamReader(pythonProcess.getInputStream()));

            new Thread(() -> {
                try {
                    String line;
                    while ((line = pythonOutputReader.readLine()) != null) {
                        session.getRemote().sendString(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnWebSocketMessage
    public void onMessage(String message) {
        try {
            pythonInputWriter.write(message);
            pythonInputWriter.newLine();
            pythonInputWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnWebSocketClose
    public void onClose(int statusCode, String reason) {
        try {
            if (pythonInputWriter != null) pythonInputWriter.close();
            if (pythonOutputReader != null) pythonOutputReader.close();
            if (pythonProcess != null) pythonProcess.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnWebSocketError
    public void onError(Throwable error) {
        error.printStackTrace();
    }
}