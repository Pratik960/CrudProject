package com.student.controller;

import java.io.IOException;

import com.student.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class AddStudent extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("fname").toString();
		String lname = request.getParameter("lname").toString();
		String course = request.getParameter("course").toString();
		
		StudentDao dao = new StudentDao();
		
		dao.addStudent(id, fname, lname, course);
		
		response.sendRedirect("ShowAllStudents.jsp");
		
	}

	

}
