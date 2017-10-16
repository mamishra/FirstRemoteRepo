<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>In sign up page</h1>


		<center>
			<form:form method="post" modelAttribute="userBean" action="addUser.do">
	  		
	  			<label for="name">Name :</label>
		  		<form:input path="name" id="name" type="text"/><br/>
		  		
		  		<label for="userName">User Name :</label>
		  		<form:input path="userName" id="userName" type="text"/><br/>
	  			
		  		<label for="password">Password :</label>
		  		<form:input path="password" id="password" type="password"/><br/>
		  		
		  		<label for="mobileNumber">Mobile Number :</label>
		  		<form:input path="mobileNumber" id="mobileNumber" type="text"/><br/>
		  		
		  		<label for="address">Address :</label>
		  		<form:input path="address" id="address" type="text"/><br/>
		  		
		  		<label for="email">Email ID :</label>
		  		<form:input path="email" id="email" type="text"/><br/>
		  		
		  		<label for="phoneNumber">Phone Number :</label>
		  		<form:input path="phoneNumber" id="phoneNumber" type="text"/><br/>
		  		
		  		<input type="submit" value="Submit Details"/>
			</form:form>
		</center>
		
		
	</body>
</html>