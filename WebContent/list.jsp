<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
	import = "java.util.List,com.example.bean.Student" 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="light green">
<jsp:include page="header.html"></jsp:include>

<!-- Iterate the student list  -->
<!-- Scriplet <% %> -->
<BR>
<table>
<tr><th>UNo</th>
	<th>Name</th>
<tr>	
<%
	List<Student> obj = (List<Student>)application.getAttribute("StudentList");
	for(Student std:obj){  
%>
<tr>
<td><%=std.getUno()%> </td>
<td><%out.println(std.getName());%> </td>
</tr>

		 
<% } %>

</table>

<BR>
<a href="HomePage.jsp">Go Back</a>






</body>
</html>