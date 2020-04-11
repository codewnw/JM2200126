<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL - param</title>
</head>
<body>
	<c:url value="jstl.jsp" var="jstl">
		<c:param name="name">Code</c:param>
		<c:param name="why">Advance Java</c:param>
		<c:param name="marks">90%</c:param>
		<c:param name="rank">#1</c:param>
	</c:url>
	${jstl}
</body>
</html>
</body>
</html>