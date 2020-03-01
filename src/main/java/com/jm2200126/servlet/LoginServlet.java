package com.jm2200126.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("doPost is running...");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username + " " + password);

		if (username.equals(password)) {
			resp.sendRedirect("profile.html");
		} else {
//			resp.sendRedirect("https://www.google.com/");
			resp.sendRedirect("login.html");
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("doGet is running...");
	}
}
