package com.hcl.project;
import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

@Test
public void testToString() {
Student objStudent=new Student();
objStudent.setSno(1);
objStudent.setSname("harika");
objStudent.setCity("Nellore");
objStudent.setCgpa(8.9);
assertEquals("Student [sno=1, name=harika, city=Nellore, cgp=8.9]",objStudent.toString());
}
@Test
public void testGettersAndSetters(){
Student objStudent=new Student();
objStudent.setSno(1);
objStudent.setSname("harika");
objStudent.setCity("Nellore");
objStudent.setCgpa(8.9);


assertEquals(1,objStudent.getSno());
assertEquals("harika",objStudent.getSname());
assertEquals("Nellore",objStudent.getCity());
assertEquals(8.9,objStudent.getCgpa(),0);

}
}







	
	
	

