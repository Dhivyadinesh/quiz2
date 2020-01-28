<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
   <body>
      <form method="post" action="admininfo">
      
            <label for="username">User Name:</label>
            <input type="text" id="username" name="username" placeholder="User Name...">
             
            <label for="username">Password:</label>
            <input type="password" id="password" name="password" placeholder="Password...">
             
            <button class="btn btn-primary form-control" type="submit">Submit</button>    
      </form>
    </body>
</html>