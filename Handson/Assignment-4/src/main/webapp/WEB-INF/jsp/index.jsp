<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Details</title>
</head>
<body>

<h1 style="color: red;">Index Page</h1>

<form action="addNewEmployee" method="Post">
<p>
Employee Id : <input name="employee_id" type="text"/><br/> </p>
<p>
Employee Name : <input name="employee_name" type="text"/><br/></p>
<p>
Employee Email : <input name="employee_email" type="text"/><br/></p>
<p>
Location : <input name="location" type="text"/><br/></p>
<p>
<input type="submit"/>
</p>
</form>
</body>
</html>