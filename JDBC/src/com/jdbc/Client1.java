package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Step-1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Step-2");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		System.out.println("Step-3");
		String query = "SELECT * FROM department";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		System.out.println("Step-4");
		while(rs.next()) {
			String DeptID = rs.getString(1);
			String DeptName = rs.getString(2);
			String Location = rs.getString(3);
			
			System.out.println(DeptID+" |"+DeptName+" |"+Location);
		}
	}
}
