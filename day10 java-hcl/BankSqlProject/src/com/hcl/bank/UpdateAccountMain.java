package com.hcl.bank;

import java.util.Scanner;

public class UpdateAccountMain {
public static void main(String[] args) {
	int accountNo;
	String city;
	String state;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter account no");
	accountNo=Integer.parseInt(sc.nextLine());
	System.out.println("enter city name");
	city=sc.nextLine();
	System.out.println("enter state name");
	state=sc.nextLine();
	AccountDAO dao=new AccountDAO();
	System.out.println(dao.updateAccount(accountNo, city, state));
}
	
}
