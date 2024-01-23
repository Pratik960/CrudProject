<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<h3>Search Student </h3>
<form action = "getStudent">

	<input type="text" name="id" placeholder="Enter ID">
	<input type="submit" name="sub" value="Get Details">
</form>

<form action="deleteStudent">
	<input type="text" name="id" placeholder="Enter ID">
	<input type="submit" name="submit" value="Delete Student">
</form>

<a href="AddStudent.jsp">Add Student</a><br>
<a href="UpdateStudent.jsp">Update Student Info</a><br>
<a href="ShowAllStudents.jsp">Show All Students</a>

</body>
</html>