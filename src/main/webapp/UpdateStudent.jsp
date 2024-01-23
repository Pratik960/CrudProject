<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student</title>
</head>
<body>

Update Student Info by Id<br>
<form action="updateStudent" method="post">
	ID : <input type="text" name="id"><br>
	
	Add New Details
	First Name : <input type="text" name="fname"><br>
	Last Name : <input type="text" name="lname"><br>
	Course : <input type="text" name="course"><br>
	<input type ="submit" name="submit"><br>

</form>

</body>
</html>