package com.hcl.employ;

import java.util.Scanner;

public class DeleteEmployMain {
public static void main(String[] args) {
	int empno;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the employ no which you want to delete");
	empno=sc.nextInt();
	EmployDAO dao=new EmployDAO();
	String employ=dao.deleteEmploy(empno);
	System.out.println(employ);
}
}
