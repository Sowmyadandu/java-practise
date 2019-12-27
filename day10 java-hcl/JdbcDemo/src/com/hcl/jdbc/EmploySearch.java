package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
public static void main(String[] args) {
	int empno;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter employ no ");
	empno=sc.nextInt();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sqlpractice","root","root");
		String cmd="select * from employ where empno=?";
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs=pst.executeQuery();
		if(rs.next()){
			System.out.println("employ no "+rs.getInt("empno"));
			System.out.println("name "+rs.getString("name"));
			System.out.println("dept "+rs.getString("dept"));
			System.out.println("design "+rs.getString("desig"));
			
			System.out.println("salary "+rs.getString("basic"));
			
		}
		else{
			System.out.println("record not found");
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
