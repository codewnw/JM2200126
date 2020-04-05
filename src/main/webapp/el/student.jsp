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
	<h1>Student Detail</h1>
	<p>${param.msg}</p>
	<table border="1">
		<tr>
			<td>Name:</td>
			<td>${requestScope.std.name}</td>
		</tr>
		<tr>
			<td>Email:</td>
			<td>${requestScope.std.email}</td>
		</tr>
		<tr>
			<td>age:</td>
			<td>${requestScope.std.age}</td>
		</tr>
		<tr>
			<td>country:</td>
			<td>${requestScope.std.country}</td>
		</tr>
		<tr>
			<td>Address:</td>
			<td>${requestScope.std.address}</td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td>${requestScope.std.gender}</td>
		</tr>
		<tr>
			<td>Status:</td>
			<td>${requestScope.std.status}</td>
		</tr>
		<tr>
			<td>Courses:</td>
			<td>${paramValues.courses[0]}${paramValues.courses[1]}
				${paramValues.courses[2]}</td>
		</tr>
	</table>
	<hr>
	<h1>Header and Header Values</h1>
	<br> Host: ${header.host}
	<br> Accepts: ${header.accept}
	<br> Accepts Language: ${header["accept-language"]}
	<br> User Agent: ${header["user-agent"]}
</body>
<hr>
<br> ${initParam.institute}
<br> ${initParam.instituteAddress}
<br> ${applicationScope.review}
<hr>
<br> ${applicationScope.highlights["courses"][0]}
<br> ${applicationScope.highlights["pinCodes"][2]}
</html>