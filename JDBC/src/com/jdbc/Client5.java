package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		String query = "Select * from department where DeptID > 5";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			String DeptID = rs.getString(1);
			String DeptName = rs.getString(2);
			String Location = rs.getString(3);
			
			System.out.println(DeptID+" |"+DeptName+" |"+Location);
		}
	}
}
