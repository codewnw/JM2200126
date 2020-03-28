
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");

	if (username.equals(password)) {
		request.setAttribute("message", "Login success!!!");
		request.getRequestDispatcher("profile.jsp").forward(request, response);
	} else {
		String msg = "Login failed, please try again....";
		response.sendRedirect("login.jsp?msg=" + msg);
	}
%>