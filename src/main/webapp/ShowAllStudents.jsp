<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.student.model.Student" %>
<%@ page import="com.student.dao.StudentDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
</head>
<body>
<a href="Home.jsp">Home</a><br>

<%
	StudentDao dao = new StudentDao();
	List<Student> students = dao.getAllStudents();
	
	for (Student data : students) {
        out.println("ID: " + data.getId() + "<br/>");
        out.println("First Name: " + data.getfName() + "<br/>");
        out.println("Last Name: " + data.getlName() + "<br/>");
        out.println("Course: " + data.getCourse() + "<br/>");
        out.println("<br/>");
    }
	


%>


</body>
</html>
