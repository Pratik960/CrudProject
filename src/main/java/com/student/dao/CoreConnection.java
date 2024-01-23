package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class CoreConnection {
	 final static String url = "jdbc:mysql://localhost:3306/student";
	 final static String uName = "root";
	 final static String pass = "";
	 
	 static {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	
	public static Connection getCoreConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,uName,pass);
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}

}
