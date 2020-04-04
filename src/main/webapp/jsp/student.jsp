<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page errorPage="my-error-page.jsp"%>
<%@ page isELIgnored="false"%>
<%@ page import="com.jm2200126.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Page !!!</title>
</head>
<body>

	<%@ include file="header.jsp"%>

	<h1>Student Detail</h1>
	<p><%=request.getParameter("msg")%></p>
	<table border="1">
		<tr>
			<td>Name:</td>
			<td><%=((Student) request.getAttribute("std")).getName()%></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><%=((Student) request.getAttribute("std")).getEmail()%></td>
		</tr>
		<tr>
			<td>age:</td>
			<td><%=((Student) request.getAttribute("std")).getAge()%></td>
		</tr>
		<tr>
			<td>country:</td>
			<td><%=((Student) request.getAttribute("std")).getCountry()%></td>
		</tr>
		<tr>
			<td>Address:</td>
			<td><%=((Student) request.getAttribute("std")).getAddress()%></td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td><%=((Student) request.getAttribute("std")).getGender()%></td>
		</tr>
		<tr>
			<td>Status:</td>
			<td><%=((Student) request.getAttribute("std")).getStatus() %></td>
		</tr>
	</table>
	<%@ include file="footer.jsp"%>
</body>
</html>