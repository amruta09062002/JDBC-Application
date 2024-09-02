package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Client3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		
		String query = "update department set Location = 'Delhi' where DeptID = 12";
		Statement st = con.createStatement();
		int rs = st.executeUpdate(query);
		System.out.println("Data updated...");	
	}
}
