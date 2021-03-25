<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01  
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html;  
 charset=UTF-8"> 
<title>Login</title> 
</head> 
<body> 	
	<p>Enter User ID:</p> 
	<form name='register' action="registerNewUser" method='POST'>
		<p>Username: <input type="text" style="width: 100px" name="username"></p>
		<p>Email: <input type="email" style="width: 100px" name="email"></p>
		<p>Password: <input type="password" style="width: 100px" name="password"></p>
		<p>Confirm Password: <input type="password" style="width: 100px" name="confirmPassword"></p>
		<input type="submit" style="width: 100px"><br/><br/>
	</form>
	<a href="home">Return to Home Screen</a>
</body> 
</html> 