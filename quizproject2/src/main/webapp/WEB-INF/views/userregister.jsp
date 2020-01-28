<html>
<head>
    <title>spring boot form submit example</title>
</head>
<style>
.container {
  align: right;
  width: 500px;
  clear: both;
}

.container input {
  align: right;
  width: 100%;
  clear: both;
}
</style>
<body>
<h3>Online Quiz Contest</h3>

<h2>Enter your Details </h2>

<div class="container">
<form method="post" action="saveDetails">
    Enter Name : <input type="text"  name="name"/><br/>
    Enter username : <input type="text" name="uname"/><br/>
    Enter Password : <input type="password" name="passwd"/><br/>
    
    <br>
 <input type="submit" value="Submit">

 </form>
 
 </div>
</body>
</html>