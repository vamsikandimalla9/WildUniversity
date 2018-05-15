<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="light green">
<jsp:include page="header.html"></jsp:include>

<form action="ControllerServlet"  method="get">
<table>
<tr><td>University Number</td>  <td><input type="text" name="uno"></td></tr>
<tr><td>Name             </td> <td> <input type="text" name="name"></td></tr>
</table>
<br><br>
<button>Submit</button>


</form>

</body>
</html>