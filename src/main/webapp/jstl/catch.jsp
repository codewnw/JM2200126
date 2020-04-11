<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL - catch</title>
</head>
<body>
	<c:catch var="ex">
		<%
			int val = 10 / 0;
				out.print(val);
		%>
	</c:catch>

	<c:if test="${ex != null }">
		<c:out value="${ex }" />
	</c:if>

</body>
</html>
</body>
</html>