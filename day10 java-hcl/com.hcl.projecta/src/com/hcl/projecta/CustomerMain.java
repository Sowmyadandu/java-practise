package com.hcl.projecta;

import java.util.List;
import java.util.Scanner;
public class CustomerMain {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("---------");
			System.out.println("1. Add Customer");
			System.out.println("2. Show Customer");
			System.out.println("3. Search Customer");
			System.out.println("4. Update Customer");
			System.out.println("5. Delete Customer");
			System.out.println("6. Write customer File");
			System.out.println("7. Read customer File");
			System.out.println("8. Exit");
			System.out.println("Enter Ur Choice  ");
			choice=sc.nextInt();
			switch(choice){
			case 1 : 
				addCustomer();
				break;
			case 2 :
				showCustomer();
				break;
			case 3 :
				searchCustomer();
				break;
			case 4 : 
				updateCustomer();
				break;
			case 5 : 
				deleteCustomer();
				break;
			case 6 :
				writeCustomerFile();
				break;
			case 7 : 
				readCustomerFile();
				break;
			default : 
				System.out.println("Invalid Choice");
			}
			
		} while (choice!=8);
	}
	public static void writeCustomerFile() {
		new CustomerBAL().writeCustomerFileBal();
	}
	
	public static void readCustomerFile() {
		new CustomerBAL().readCustomerFileBal();
	}
		public static void updateCustomer(){
			Customer objCustomer=new Customer();
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter customer id");
			 objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
			 System.out.println("enter customer name");
			 objCustomer.setCustName(sc.nextLine());
			 System.out.println("enter customer annual premium");
			 objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
			 System.out.println("enter customer modal premium");
			 objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
			 CustomerBAL obj=new CustomerBAL();
			 System.out.println(obj.updateCustomerBal(objCustomer));
		}
		public static void deleteCustomer(){
			int sno;
			System.out.println("enter student no");
			Scanner sc=new Scanner(System.in);
			sno=sc.nextInt();
			CustomerBAL obj=new CustomerBAL();
			System.out.println(obj.deleteCustomerBal(sno));}
		public static void searchCustomer(){
			int sno;
			System.out.println("enter student no");
			Scanner sc=new Scanner(System.in);
			sno=sc.nextInt();
			CustomerBAL obj=new CustomerBAL();
			Customer customer=obj.searchCustomerBal(sno);
			if(customer==null){
				System.out.println("student record not found...");
			}
			else{
				System.out.println(customer);
			}
		}
		public static void showCustomer(){
			CustomerBAL obj=new CustomerBAL();
			List<Customer> customers=obj.showCustomerBal()	;
			for (Customer customer : customers) {
				System.out.println(customer);
				
			}
			
				
			}
		
	 public static void addCustomer(){
		 Customer objCustomer=new Customer();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter customer id");
		 objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
		 System.out.println("enter customer name");
		 objCustomer.setCustName(sc.nextLine());
		 System.out.println("enter customer annual premium");
		 objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		 System.out.println("enter customer modal premium");
		 objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		 CustomerBAL obj=new CustomerBAL();
		 System.out.println("enter customer payment no");
		 objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		 
		 try {
			boolean res=obj.addCustomerBal(objCustomer);
			if(res==true){
				System.out.println("student added successfully...");
			}
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		 
		 
		 
	 }
	}

	
