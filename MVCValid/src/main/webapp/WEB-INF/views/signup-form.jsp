<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveSignUpForm" method="post" >
<pre>

FirstName:<input type="text" name="user">
<br>
LastName:<input type="text" name="last">
<br>
UserName:<input type="text" name="uses">
<br>
Password:<input type="password" name="us">
<br>
email:<input type="text" name="ems">
<br>

<input type="submit" value="submit">

</pre>
</form>

</body>
</html>