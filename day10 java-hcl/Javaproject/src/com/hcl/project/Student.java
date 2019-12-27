package com.hcl.project;

import java.io.Serializable;

public class Student implements Serializable {
private int sno;
private String sname;
private String city;
private double cgpa;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getCgpa() {
	return cgpa;
}
public void setCgpa(double cgpa) {
	this.cgpa = cgpa;
}
@Override
public String toString() {
	return "Student [sno=" + sno + ", sname=" + sname + ", city=" + city
			+ ", cgpa=" + cgpa + "]";
}


}
