package com.hcl.databaseproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
Connection connection;
PreparedStatement pst;
public int generateAccountNo(){
	connection=DaoConnection.getConnection();
	String cmd=" select case when max(accountno) is null " +
	" then 1 else max(accountno)+1 end "+ " accountno from accounts ";
	int accountNo=0;
 try {
	pst=connection.prepareStatement(cmd);
	ResultSet rs=pst.executeQuery();
	rs.next();
	accountNo=rs.getInt("accountno");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 return accountNo;
 }
}
