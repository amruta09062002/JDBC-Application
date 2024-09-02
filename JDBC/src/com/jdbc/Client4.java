package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Client4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		
		String query = "delete from department where DeptID = 12";
		Statement st = con.createStatement();
		int rs = st.executeUpdate(query);
		System.out.println("Row deleted...");
	}
}
