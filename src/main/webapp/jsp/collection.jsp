<%@ page import="java.util.*"%>
<%@ page isThreadSafe="false"%>

<%
	List<String> fruits = new ArrayList<>();
	fruits.add("Apple");
	fruits.add("Banana");
	fruits.add("Guava");

	for (String fruit : fruits) {
		out.println(fruit);
		%>
		<br>
		<%
	}
%>