package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Client2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		
		String query = "insert into department(DeptID,DeptName,Location) Values (12,'MBA','Pune')";
		Statement st = con.createStatement();
		int rs = st.executeUpdate(query);
		System.out.println("Data inserted = " +rs);
	}

}
