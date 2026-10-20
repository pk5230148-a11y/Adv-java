
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
    urlPatterns = "/config-context",
    initParams = {
        @WebInitParam(name = "college", value = "Global Institute of Technology")
    }
)
public class ConfigContextServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        ServletConfig config = getServletConfig();
        String college = config.getInitParameter("college");

        ServletContext context = getServletContext();
        String serverInfo = context.getServerInfo();

        PrintWriter out = response.getWriter();

        out.println("<h1>ServletConfig and ServletContext</h1>");
        out.println("<p>College: " + college + "</p>");
        out.println("<p>Server Information: " + serverInfo + "</p>");
    }
}
