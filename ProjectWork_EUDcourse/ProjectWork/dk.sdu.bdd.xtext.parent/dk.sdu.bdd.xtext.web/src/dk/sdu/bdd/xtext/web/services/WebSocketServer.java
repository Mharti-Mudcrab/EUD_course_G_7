package dk.sdu.bdd.xtext.web.services;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class WebSocketServer{

    public static void main(String[] args) throws Exception {
        // Create a Jetty server on port 8080
        Server server = new Server(8080);

        // Set up a WebSocket context
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);


        // Start the server
        System.out.println("Starting WebSocket server on port 8080...");
        server.start();
        System.out.println("WebSocket server started successfully. Listening at ws://localhost:8080/debug");
        server.join();
    }
}
