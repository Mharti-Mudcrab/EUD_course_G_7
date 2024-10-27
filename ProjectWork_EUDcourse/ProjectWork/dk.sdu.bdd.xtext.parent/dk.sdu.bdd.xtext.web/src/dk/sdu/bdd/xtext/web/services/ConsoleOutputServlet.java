package dk.sdu.bdd.xtext.web.services;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/console-output")
public class ConsoleOutputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/event-stream");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Connection", "keep-alive");

        PrintWriter writer = response.getWriter();

        try {
            // Get the root path of the web application
            String rootPath = getServletContext().getRealPath("/");
            String relativePath = "../../dk.sdu.bdd.xtext.examples/src/dk/sdu/bdd/xtext/examples/features/main.py";
            String absoluteFilePath = new File(rootPath, relativePath).getCanonicalPath();

            // Log the path being used
            writer.write("data: Using script at: " + absoluteFilePath + "\n\n");
            writer.flush();

            List<String> command = new ArrayList<>();
            command.add("python");
            command.add(absoluteFilePath);
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.trim().isEmpty()) {
                        writer.write("data: " + line + "\n\n");
                        writer.flush();
                    }
                }
            }

            int exitCode = process.waitFor();
            writer.write("data: Process completed with exit code: " + exitCode + "\n\n");
            writer.write("event: close\ndata: Execution finished\n\n");
            writer.flush();

        } catch (Exception e) {
            writer.write("data: Error: " + e.getMessage() + "\n\n");
            writer.flush();
            e.printStackTrace();
        }
    }
}
