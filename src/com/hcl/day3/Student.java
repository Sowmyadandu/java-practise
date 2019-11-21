package com.hcl.day3;

public class Student {
	int sno;
	String name;
	double cgp;
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", cgp=" + cgp + "]";
	}
	public void showDetails(){
		Student s1=new Student();
		s1.sno=1;
		s1.name="Panda";
		s1.cgp=9.8;
		Student s2=new Student();
		s2.sno=2;
		s2.name="rosh";
		s2.cgp=9.9;
		Student s3=new Student();
		s3.sno=3;
		s3.name="pooja";
		s3.cgp=9.5;
		Student s4=new Student();
		s4.sno=4;
		s4.name="valli";
		s4.cgp=9.2;
		Student[] arr={s1,s2,s3,s4};
		for (Student student : arr) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		
		new Student().showDetails();
	}

}
