<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL - forEach</title>
</head>
<body>
	<%
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Guava");
		fruits.add("Pine Aplle");
		session.setAttribute("frts", fruits);
	%>

	<%-- 
<c:set var="frts" value="${sessionScope.frts}" />
<c:out value="${frts}" /> --%>

	<c:forEach var="fruit" items="${sessionScope.frts}">
${fruit}
</c:forEach>

	<c:forEach var="i" begin="0" end="9">
${i }
</c:forEach>
</body>
</html>
</body>
</html>