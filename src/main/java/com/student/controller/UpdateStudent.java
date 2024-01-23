package com.student.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.student.dao.StudentDao;


public class UpdateStudent extends HttpServlet {
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("fname").toString();
		String lname = request.getParameter("lname").toString();
		String course = request.getParameter("course").toString();
		
		StudentDao dao = new StudentDao();
		
		dao.updateStudent(id, fname, lname, course);
		
		response.sendRedirect("ShowAllStudents.jsp");
	}

}
