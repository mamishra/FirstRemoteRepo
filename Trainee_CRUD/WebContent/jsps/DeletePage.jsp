<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
		<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
	</head>
	<body bgcolor="wheat">
		<h1>Delete Operation</h1>
		<h3></h3>
		
		<form action="delete.do">
			<table>
				<tr>
					<td>Please Enter Trainee ID:</td>
					<td><input type="number" name="tId" id="tId"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="delete"></td>
				</tr>
			</table>
		</form>
		<a href="getHomePage.do">HOME</a>
	</body>
</html>