package com.student.controller;

import java.io.IOException;

import com.student.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class DeleteStudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		StudentDao dao = new StudentDao();
		dao.deleteStudent(id);
		
		response.sendRedirect("ShowAllStudents.jsp");
		
	}


}
