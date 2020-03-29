<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page errorPage="my-error-page.jsp" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<%@ include file="header.jsp"%>

	<h1>Login page</h1>
	 <%
		String msg = request.getParameter("msg");
	%>
	<p style="color: red"><%=msg == null ? "" : msg%></p>
	<%-- <p style="color: red">${param.msg}</p> --%>
	<form method="post" action="process-login.jsp">
		<table border="1">
			<tr>
				<td>Username</td>
				<td><input type="text" name="username"
					placeholder="Enter username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"
					placeholder="Enter password"></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
	
	<%@ include file="footer.jsp"%>
</body>
</html>