<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="addqueselec">
    <label for="ques_text">ques_text</label>
    
    <input type="text" id="ques_text" th:field="*{ques_text}">

    <label for=" opt_1">  opt1 </label>
    <input type="text" id=" opt_1" th:field="*{opt_1}" >
    
    <label for=" opt_2">  opt2 </label>
    <input type="text" id=" opt_2" th:field="*{opt_2}">
    
    <label for=" opt_3">  opt3 </label>
    <input type="text" id=" opt_3" th:field="*{opt_3}" >
    
    <label for=" opt_4">  opt4 </label>
    <input type="text" id=" opt_4" th:field="*{opt_4}">
    
    <input type="submit" value="Submit">

</form>
</body>
</html>