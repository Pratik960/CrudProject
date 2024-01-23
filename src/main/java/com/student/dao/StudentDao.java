package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;

public class StudentDao {
	
	public Student getStudent(int id) {
		Student s = new Student();
		
		try(Connection con = CoreConnection.getCoreConnection();
			Statement st = con.createStatement();){
			ResultSet rs = st.executeQuery("select * from studentinfo where id="+id);
			if(rs.next()) {
				s.setId(rs.getInt("id"));
				s.setfName(rs.getString("firstName"));
				s.setlName(rs.getString("lastName"));
				s.setCourse(rs.getString("course"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public void addStudent(int id, String fname, String lname, String course) {
		try{
			Connection con = CoreConnection.getCoreConnection();
			PreparedStatement st = con.prepareStatement("insert into studentinfo values(?,?,?,?)");
			
			st.setInt(1, id);
			st.setString(2, fname);
			st.setString(3, lname);
			st.setString(4, course);
			st.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(int id) {
		try(Connection con = CoreConnection.getCoreConnection();
				Statement st = con.createStatement();){
			st.executeUpdate("delete from studentinfo where id="+id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateStudent(int id,String fname, String lname, String course) {
		try(Connection con = CoreConnection.getCoreConnection();
				
				PreparedStatement st = con.prepareStatement("update studentinfo set id=?, firstName=?,lastName=?,course=? where id="+id);){
				st.setInt(1, id);
				st.setString(2, fname);
				st.setString(3,lname);
				st.setString(4,course);
				st.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	public List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		try(Connection con = CoreConnection.getCoreConnection();
			Statement st = con.createStatement();){
			ResultSet rs = st.executeQuery("select * from studentinfo");
			
			while(rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setfName(rs.getString(2));
				s.setlName(rs.getString(3));
				s.setCourse(rs.getString(4));
				students.add(s);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return students;
	}
	

}
