<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>

<html>
<body>
<form method="post" action="saveAns">
<input type="hidden" name="userId" value="${userId}">

   <table> 
   <c:forEach var="q" items="${Electric}">
                <tr>
                    <td><c:out value="${e.ques_text}" /></td>
					<td>
					<input type="radio" name="${e.ques_id}" value="${e.opt_1}"><c:out value="${e.opt_1}" /><br>
                   
                    <input type="radio" name="${e.ques_id}" value="${e.opt_2}"><c:out value="${e.opt_2}" /><br>
                   
                    <input type="radio" name="${e.ques_id}" value="${e.opt_3}"><c:out value="${e.opt_3}" /><br>
                   
                    <input type="radio" name="${e.ques_id}" value="${e.opt_4}"><c:out value="${e.opt_4}" /><br>
                	</td>
                </tr>
    </br>
   </c:forEach>

</table>
  <input type="submit" value="Submit">
</form>

</body>
</html>

