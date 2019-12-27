package com.hcl.employ;

import java.util.List;

public class CreateAccountMain {
	public static void main(String[] args) {
		EmployDAO dao=new EmployDAO();	
		List<Employ> employList=dao.showEmploy();
		for (Employ employ : employList) {
			System.out.println("employ no "+employ.getEmpno());
			System.out.println("employ name "+employ.getName());
			System.out.println("employ dept "+employ.getDept());
			System.out.println("employ desig"+employ.getDesig());
			System.out.println("employ sal "+employ.getBasic());
			System.out.println("-----------------------------------------");
			
		}
		}

}
