<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register form</title>
<style type="text/css">
h1
{
	color:red;
}
.button{
	
	padding:12px 20px;
}
</style>
</head>
<body>
	<form action="/Application/RegisterServlet" method="post">
	  <table align="center">
        <tr>
          <center><h1>Registration Form</h1></center>
        </tr>
        <tr>
          <td>
          <h3 align="right">First Name  </h3></td>
            <td><input type="text" name="FirstName"align="center"></td>
        </tr>
      <tr>
        <td>
        <h3 align="right">last Name  </h3></td>
          <td><input type="text" name="LastName"align="center"></td>
      </tr>
      <tr>
        <td>
        <h3 align="right">Username  </h3></td>
          <td><input type="text" name="Username"align="center"></td>
      </tr>
      <tr>
        <td>
        <h3 align="right">Password  </h3></td>
          <td><input type="password" name="Password"align="center"></td>
      </tr>
      <tr>
        <td>
        <h3 align="right">Email  </h3></td>
          <td><input type="text" name="Email"align="center"></td>
      </tr>
      <tr>
        <td>
        <h3 align="right">Mobile No  </h3></td>
          <td><input type="text" name="Mobile"align="center"></td>
      </tr>
  
 <tr> 
  <td><center><input type="submit" class="button" value="sign up"></center></td>
  <td><a href="login.jsp">login</a></td>
  </tr>
  </table>
	</form>
</body>
</html>