<%@ page errorPage="my-error-page.jsp" %>
<%
	int i = 10 / 0;
	out.print(i);
%>