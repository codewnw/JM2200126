<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL - if</title>
</head>
<body>
	<c:set var="userName" scope="session" value="codewnw" />
	<c:if test="${userName eq 'codewnw'}">
		<c:out value="${userName}" />
	</c:if>
</body>
</html>
</body>
</html>