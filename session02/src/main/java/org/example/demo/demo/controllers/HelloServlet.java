package org.example.demo.demo.controllers;

import java.io.*;
import java.sql.Connection;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.demo.demo.utils.DataConnect;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        try (Connection con = DataConnect.openConnect()) {
            String sql = "SELECT * FROM persons";
        } catch (Exception e) {

        }
    }

    public void destroy() {
    }
}