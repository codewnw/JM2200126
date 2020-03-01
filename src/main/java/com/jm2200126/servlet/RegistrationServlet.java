package com.jm2200126.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(this.getClass().getSimpleName());
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String[] courses = request.getParameterValues("courses");
		String country = request.getParameter("country");

		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(country);

		for (int i = 0; i < courses.length; i++) {
			System.out.print(courses[i] + " ");
		}
		System.out.println("");

		// forward this to profile servlet
		request.setAttribute("message", "Registration Successful!!!");
		RequestDispatcher rd = request.getRequestDispatcher("profile");
		rd.forward(request, response);

	}

}
