package com.jm2200126.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet-me")
public class GreetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GreetServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String message = "Good morning!!!, " + name;

		PrintWriter out = response.getWriter();
		out.print(message);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		out.print("<table border=\"1px\">\r\n" + "		<tr>\r\n" + "			<td>Good morning!!!, </td>\r\n"
				+ "			<td>" + name + "</td>\r\n" + "		</tr>\r\n" + "	</table>");
	}
}
