
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/read-cookie")
public class ReadCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        String value = null;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("studentName".equals(cookie.getName())) {
                    value = cookie.getValue();
                    break;
                }
            }
        }

        out.println("<h1>Read Cookie</h1>");

        if (value != null) {
            out.println("<p>Cookie value: " + value + "</p>");
        } else {
            out.println("<p>Cookie not found.</p>");
        }
    }
}
