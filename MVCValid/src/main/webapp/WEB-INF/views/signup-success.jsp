<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h1>${message}</h1>
   <hr />

   <table class="table table-striped table-bordered">
    <tr>
     <td><b>First Name </b>: ${user.firstName}</td>
    </tr>
    <tr>
     <td><b>Last Name </b> : ${user.lastName}</td>
    </tr>
    <tr>
     <td><b>UserName </b> : ${user.userName}</td>
    </tr>
    <tr>
     <td><b>Email </b>: ${user.email}</td>
    </tr>
   </table>
</body>
</html>