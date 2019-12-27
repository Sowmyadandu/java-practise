package com.hcl.project;



import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class StudentBalTest {
	@Test
	public void testUpdatehStudent() throws StudentException {
		Student student2=new Student();
		student2.setSno(3);
		student2.setSname("Harika");
		student2.setCity("Chennai");
		student2.setCgpa(8.9);
		StudentBAL bal=new StudentBAL();
		String result=bal.updateStudentBal(student2);
		assertEquals("Student Record Updated...", result);
		Student student3=new Student();
		student3.setSno(-3);
		student3.setSname("Harika");
		student3.setCity("Chennai");
		student3.setCgpa(8.9);
		
		result=bal.updateStudentBal(student3);
		assertEquals("Student Record Not Found...", result);
	}
	@Test
	public void testSearchStudent() throws StudentException {
		StudentBAL bal=new StudentBAL();
		Student student1=bal.searchStudentBal(-1);
		assertNull(student1);
		Student student2=bal.searchStudentBal(1);
		assertNotNull(student2);
	}
	@Test
	public void testShowAllStudent() throws StudentException {
		Student student1=new Student();
		student1.setSno(1);
		student1.setSname("Navya");
		student1.setCity("Chennai");
		student1.setCgpa(9.9);
		StudentBAL bal=new StudentBAL();
		bal.addStudentBal(student1);
		
		Student student2=new Student();
		student2.setSno(3);
		student2.setSname("Harika");
		student2.setCity("Chennai");
		student2.setCgpa(8.9);
		
		bal.addStudentBal(student2);
		List<Student> students=bal.showStudentBal();
		assertEquals(3, students.size());
	}
	@Test
	public void testAddStudent() throws StudentException {
		Student student=new Student();
		student.setSno(1);
		student.setSname("Navya");
		student.setCity("Chennai");
		student.setCgpa(9.9);
		StudentBAL bal=new StudentBAL();
		assertEquals("Student Created Successfully...",
				bal.addStudentBal(student));
	}
	@Test(expected=StudentException.class)
	public void testEx1() throws StudentException  {
		Student student=new Student();
		student.setSno(1);
		student.setSname("dd");
		student.setCity("Chennai");
		student.setCgpa(9.9);
		StudentBAL bal=new StudentBAL();
		bal.addStudentBal(student);
	}
	@Test(expected=StudentException.class)
	public void testEx2() throws StudentException  {
		Student student=new Student();
		student.setSno(-1);
		student.setSname("Navya");
		student.setCity("Chennai");
		student.setCgpa(9.9);
		StudentBAL bal=new StudentBAL();
		bal.addStudentBal(student);
	}
	@Test(expected=StudentException.class)
	public void testEx3() throws StudentException  {
		Student student=new Student();
		student.setSno(1);
		student.setSname("Navya");
		student.setCity("a");
		student.setCgpa(9.9);
		StudentBAL bal=new StudentBAL();
		bal.addStudentBal(student);
	}
	@Test(expected=StudentException.class)
	public void testEx4() throws StudentException  {
		Student student=new Student();
		student.setSno(1);
		student.setSname("Navya");
		student.setCity("Chennai");
		student.setCgpa(-1.1);
		StudentBAL bal=new StudentBAL();
		bal.addStudentBal(student);
	}	
}

