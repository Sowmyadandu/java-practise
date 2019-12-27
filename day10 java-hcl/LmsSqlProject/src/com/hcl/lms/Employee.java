package com.hcl.lms;

import java.util.Date;

public class Employee {
private int empid;
private String empname;
private String empphoneno;
private String empemailid;
private String dept;
private Date joiningdate;
private int mgrid;
private int empleavebal;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpphoneno() {
	return empphoneno;
}
public void setEmpphoneno(String empphoneno) {
	this.empphoneno = empphoneno;
}
public String getEmpemailid() {
	return empemailid;
}
public void setEmpemailid(String empemailid) {
	this.empemailid = empemailid;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}

public int getMgrid() {
	return mgrid;
}
public void setMgrid(int mgrid) {
	this.mgrid = mgrid;
}
public int getEmpleavebal() {
	return empleavebal;
}
public void setEmpleavebal(int empleavebal) {
	this.empleavebal = empleavebal;
}
public Date getJoiningdate() {
	return joiningdate;
}
public void setJoiningdate(Date joiningdate) {
	this.joiningdate = joiningdate;
}


}
