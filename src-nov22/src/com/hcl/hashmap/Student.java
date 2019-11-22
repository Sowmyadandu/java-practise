package com.hcl.hashmap;

public class Student implements Comparable<Student> {
	int sno;
	String sname;
	String city;
	double cgp;
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", city=" + city
				+ ", cgp=" + cgp + "]";
	}
	public Student() {
		super();
	}
	public Student(int sno, String sname, String city, double cgp) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.sname.compareTo(s.sname);
	}
	
	
	

}
