package com.jm2200126.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/php-enrollment" }, initParams = { @WebInitParam(name = "trainerName", value = "John"),
		@WebInitParam(name = "trainerMobile", value = "1234567890") })
public class PhpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");

		ServletConfig servletConfig = getServletConfig();
		String trainerName = servletConfig.getInitParameter("trainerName");
		String trainerMobile = servletConfig.getInitParameter("trainerMobile");

		ServletContext servletContext = servletConfig.getServletContext();
		String institute = servletContext.getInitParameter("institute");
		String instituteAddress = servletContext.getInitParameter("instituteAddress");

		response.setContentType("text/HTML");
		PrintWriter out = response.getWriter();
		out.print("Hello, " + name + "<br>");
		out.print("Your trainer is " + trainerName + " and his mobile number is " + trainerMobile + "." + "<br>");
		out.print("Classes will be in " + institute + ", " + instituteAddress + " campus." + "<br>");
	}

}
