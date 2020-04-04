<%@ page import="com.jm2200126.model.*"%>
<jsp:useBean id="student" class="com.jm2200126.model.Student"></jsp:useBean>
<jsp:setProperty property="*" name="student" />
<jsp:setProperty property="status" name="student" value="Not Varified" />
<%@ page isELIgnored="false"%>
<%
	request.setAttribute("std", student);
%>
<jsp:forward page="student.jsp">
	<jsp:param value="Registration successful." name="msg" />
</jsp:forward>