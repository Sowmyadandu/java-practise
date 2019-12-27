package com.hcl.hashmap;

public class Employ implements Comparable<Employ> {

	int empno;
	String name;
	String dept;
	String desg;
	double salary;
	public Employ() {
		super();
	}
	public Employ(int empno, String name, String dept, String desg,
			double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.desg = desg;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept
				+ ", desg=" + desg + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employ e) {
		// TODO Auto-generated method stub
		return e.name.compareTo(this.name);
	}
	
}
