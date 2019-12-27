package com.hcl.databaseproject;

public class CreateAccountMain {
	public static void main(String[] args) {
		AccountDAO dao=new AccountDAO();
		System.out.println(dao.generateAccountNo());
	}

}
