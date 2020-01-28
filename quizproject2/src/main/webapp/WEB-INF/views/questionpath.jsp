<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>

<html>
<head>
    <title>Success</title>
</head>
<body>
<h2>Welcome ${user.name} !!!!</h2>

<form action="http://localhost:8090/question" method="post">

 <input type="hidden" name="userId" value="${user.id}">
 
<input type="submit" value="Go to Questions Page">

</form>

<br>

<form action="http://localhost:8090/electric" method="post">

 <input type="hidden" name="userId" value="${user.id}">
 
<input type="submit" value="Go to Electric Page">
</form>

</body>
</html>