<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<head>
<style>
span.error {
color: red;
display: inline-block;
}
body {
  background-color: violet;
}
</style>
</head>
<body>

<h3> Registration Form <h3>
<br/>
 <frm:form action="register" method="post" modelAttribute="user">
  <pre>
                  Name <frm:input path="name" />
                       <frm:errors path="name" cssClass="error" />

         Email address <frm:input path="emailAddress" />
                       <frm:errors path="emailAddress" cssClass="error" />

              Password <frm:password path="password" />
                       <frm:errors path="password" cssClass="error" />

                                  <input type="submit" value="Submit" />
  </pre>
 </frm:form>
</body>
</html>