package com.student.controller;

import java.io.IOException;

import com.student.dao.StudentDao;
import com.student.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class StudentInfo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid = Integer.parseInt(request.getParameter("id"));
		StudentDao dao = new StudentDao();
		Student s = dao.getStudent(sid);
		
		request.setAttribute("student", s);
		
		RequestDispatcher rd = request.getRequestDispatcher("showStudent.jsp");
		rd.forward(request, response);
		
	}


}
