package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        message = "Hello msg";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter messageWriter = resp.getWriter();
        messageWriter.println("<h1>" + message + "<h1>");
    }

    @Override
    public void destroy() {

    }
}
