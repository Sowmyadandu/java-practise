package com.hcl.project;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("---------");
			System.out.println("1. Add Student");
			System.out.println("2. Show Student");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Write Student File");
			System.out.println("7. Read Student File");
			System.out.println("8. Exit");
			System.out.println("Enter Ur Choice  ");
			choice=sc.nextInt();
			switch(choice){
			case 1 : 
				addStudent();
				break;
			case 2 :
				showStudent();
				break;
			case 3 :
				searchStudent();
				break;
			case 4 : 
				updateStudent();
				break;
			case 5 : 
				deleteStudent();
				break;
			case 6 :
				writeStudentFile();
				break;
			case 7 : 
				readStudentFile();
				break;
			case 8 : 
				return;
			default : 
				System.out.println("Invalid Choice");
			}
			
		} while (choice!=8);
	}
	
	public static void writeStudentFile() {
		new StudentBAL().writeStudentFileBal();
	}
	
	public static void readStudentFile() {
		new StudentBAL().readStudentFileBal();
	}
	public static void updateStudent(){
		Student objStudent=new Student();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter student no");
		 objStudent.setSno(Integer.parseInt(sc.nextLine()));
		 System.out.println("enter student name");
		 objStudent.setSname(sc.nextLine());
		 System.out.println("enter student city");
		 objStudent.setCity(sc.nextLine());
		 System.out.println("enter student cgpa");
		 objStudent.setCgpa(Double.parseDouble(sc.nextLine()));
		 StudentBAL obj=new StudentBAL();
		 System.out.println(obj.updateStudentBal(objStudent));
	}
	public static void deleteStudent(){
		int sno;
		System.out.println("enter student no");
		Scanner sc=new Scanner(System.in);
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL();
		System.out.println(obj.deleteStudentBal(sno));}
	public static void searchStudent(){
		int sno;
		System.out.println("enter student no");
		Scanner sc=new Scanner(System.in);
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL();
		Student student=obj.searchStudentBal(sno);
		if(student==null){
			System.out.println(rb.getString("not"));
		}
		else{
			System.out.println(student);
		}
	}
	public static void showStudent(){
		StudentBAL obj=new StudentBAL();
		List<Student> students=obj.showStudentBal()	;
		for (Student student : students) {
			System.out.println(student);
			
		}
		
			
		}
	
 public static void addStudent(){
	 Student objStudent=new Student();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter student no");
	 objStudent.setSno(Integer.parseInt(sc.nextLine()));
	 System.out.println("enter student name");
	 objStudent.setSname(sc.nextLine());
	 System.out.println("enter student city");
	 objStudent.setCity(sc.nextLine());
	 System.out.println("enter student cgpa");
	 objStudent.setCgpa(Double.parseDouble(sc.nextLine()));
	 StudentBAL obj=new StudentBAL();
	 try {
		boolean res=obj.addStudentBal(objStudent);
		if(res==true){
			System.out.println(rb.getString("add"));
		}
	} catch (StudentException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	 
	 
	 
 }
 static ResourceBundle rb=null;
 static{
	 
	  rb=ResourceBundle.getBundle("student");
 }
 
}
