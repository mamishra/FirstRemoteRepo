<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Home Page</title>
		<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
		<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
	</head>
	<body bgcolor="wheat">
		
		<h1>Capgemini India Pvt. Ltd. Mumbai</h1>
		<h3>Login Page</h3>
		
		<br/><br/>
		
		<div id="mainMenu">
		<center>
		<form action="getEntryPage.do">
			<table>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="name" id="name"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" id="password"></td>
				</tr>
				<tr> <td colspan="2"><input type="submit" value="Login"> </td></tr>
			</table>
		</form>
		</center>
		</div>
		
		
		
		<!-- <div id="mainMenu">
			<a href="getEmpList.do">View List</a><br/><br/>
			<a href="getEntryPage.do">Join New Employee</a><br/><br/>
			<a href="getUpdateNamePage.do">Update Employee Name</a><br/>
		</div> -->
		
	</body>
</html>