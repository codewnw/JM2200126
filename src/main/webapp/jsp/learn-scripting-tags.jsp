<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learn scripting tags</title>
</head>
<body>
	<h1>Scripting tags</h1>
	<%
		String name = "Rohit";
	%>
	<%=name + " " + surname%>
	<br>
	<%=(2 + 3) * 5%>

	<%!public int sum(int a, int b) {
		return (a + b);
	}

	String surname = "Tendulkar";%>
	<br>
	<%=sum(10, 20)%>
</body>
</html>