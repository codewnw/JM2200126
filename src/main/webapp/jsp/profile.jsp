<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<h1>
		Welcome,
		<%=request.getParameter("username")%></h1>
	<p>
		<%
			String messageFromProcessLogin = request.getAttribute("message").toString();
			out.print(messageFromProcessLogin);
		%>
	</p>
	<p>
		This is
		<%
		out.print("Rapid Cart");
	%>
	</p>
</body>
</html>