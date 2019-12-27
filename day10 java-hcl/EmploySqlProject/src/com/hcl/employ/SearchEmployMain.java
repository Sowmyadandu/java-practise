package com.hcl.employ;

import java.util.Scanner;

public class SearchEmployMain {
public static void main(String[] args) {
	int empno;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter employee no");
	empno=sc.nextInt();
	EmployDAO dao=new EmployDAO();
	Employ employ=dao.searchEmploy(empno);
	if(employ!=null){
		System.out.println("name "+employ.getName());
		System.out.println("basic "+employ.getBasic());
		System.out.println("desig "+employ.getDesig());
		System.out.println("dept "+employ.getDept());
	}else{
		System.out.println("record not found....");
	}
	
	
}
}

