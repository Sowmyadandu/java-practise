package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCustomer {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			System.out.println("connected...");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from agent");
			
			while(rs.next()){
				System.out.println("FirstName "+rs.getString("FirstName"));
				System.out.println("MI "+rs.getString("MI"));
				System.out.println("LastName "+rs.getString("LastName"));
				
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}



