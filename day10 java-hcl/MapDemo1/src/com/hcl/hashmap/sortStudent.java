package com.hcl.hashmap;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortStudent {
	public static void main(String[] args) {
		SortedSet<Student> students=new TreeSet<Student>();
		students.add(new Student(1,"sowmya","nellore",7.8));
		students.add(new Student(2,"siva","nellore",7.8));
		students.add(new Student(3,"sow","nellore",7.8));
		students.add(new Student(4,"sai","nellore",7.8));
		students.add(new Student(5,"sri","nellore",7.8));
		
  for(Student student:students){
	  System.out.println(student);
  }
	  
  }
}
