
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        Cookie visitCookie = new Cookie("studentName", "Student");
        visitCookie.setMaxAge(60 * 60);
        visitCookie.setHttpOnly(true);
        response.addCookie(visitCookie);

        PrintWriter out = response.getWriter();
        out.println("<h1>Cookie Created Successfully!</h1>");
        out.println("<p>Cookie name: studentName</p>");
        out.println("<p>Cookie value: Student</p>");
        out.println("<a href='read-cookie'>Read Cookie</a>");
    }
}
