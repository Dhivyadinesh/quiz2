<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome ${admin.name} !!!!</h2>

<form action="http://localhost:8090/addquestion" method="post">

 <input type="hidden" name="adminId" value="${admin.id}">
 
<input type="submit" value="Go to AddQuestion Page">

</form>

<br>

<form action="http://localhost:8090/userdetails" method="post">

 <input type="hidden" name="adminId" value="${admin.id}">
 
<input type="submit" value="Go to userDetails Page">
</form>
</body>
</html>