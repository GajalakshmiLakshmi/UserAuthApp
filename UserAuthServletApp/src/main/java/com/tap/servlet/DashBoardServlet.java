package com.tap.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@WebServlet("/dashboard")
public class DashBoardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = (String) request.getAttribute("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome, " + username + "!</h1>");
    }
}

