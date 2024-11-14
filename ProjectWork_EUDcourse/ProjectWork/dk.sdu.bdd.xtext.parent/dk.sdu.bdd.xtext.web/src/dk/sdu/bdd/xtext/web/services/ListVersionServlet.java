package dk.sdu.bdd.xtext.web.services;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import java.io.*;
import java.util.List;

@WebServlet("/list-versions")
public class ListVersionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String rootPath = getServletContext().getRealPath("/");
        VersionControl versionControl = new VersionControl(rootPath);
        
        List<JSONObject> versions = versionControl.listVersions();
        response.setContentType("application/json");
        response.getWriter().write(versions.toString());
    }
}
