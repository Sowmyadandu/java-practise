package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentSearch {

	public static void main(String[] args) {
		int agentID;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter agent id ");
		agentID=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			String cmd="select * from agent where agentID=?";
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, agentID);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println("FirstName "+rs.getString("FirstName"));
				System.out.println("MI "+rs.getString("MI"));
				System.out.println("LastName "+rs.getString("LastName"));
				System.out.println("marital status "+rs.getInt("maritalStatus"));
				
				
				
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

