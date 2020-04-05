<%@ page import="com.jm2200126.model.*, java.util.*"%>
<jsp:useBean id="student" class="com.jm2200126.model.Student"></jsp:useBean>
<jsp:setProperty property="*" name="student" />
<jsp:setProperty property="status" name="student" value="Not Varified" />
<%@ page isELIgnored="false"%>
<%
	request.setAttribute("std", student);
	application.setAttribute("review", "Awesome");

	Map<String, List> highlights = new HashMap<>();
	List<String> courses = new ArrayList<>();
	courses.add("Java");
	courses.add("PHP");
	courses.add("Python");
	
	List<Integer> pinCodes = new ArrayList<>();
	pinCodes.add(new Integer(560001));
	pinCodes.add(new Integer(560002));
	pinCodes.add(new Integer(560003));
	
	highlights.put("courses", courses);
	highlights.put("pinCodes", pinCodes);
	
	application.setAttribute("highlights", highlights);
%>
<jsp:forward page="student.jsp">
	<jsp:param value="Registration successful." name="msg" />
</jsp:forward>