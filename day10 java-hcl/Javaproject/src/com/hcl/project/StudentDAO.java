package com.hcl.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentDAO {
  static List<Student> lststudent = null;
  static ResourceBundle rb=null;
  static{
	  lststudent=new ArrayList<Student>();
	  rb=ResourceBundle.getBundle("student");
  }
  
  @SuppressWarnings("unchecked")
public void readStudentFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/student.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lststudent =(List<Student>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
  
  public void writeStudentFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lststudent);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
  public String addStudentDao(Student student){
	lststudent.add(student);
	return rb.getString("add");
  }
  public List<Student> showStudentDao() {
	  return lststudent;
	  }
  
  public Student searchStudentDao(int sno){
	  Student objStudent=null;
	  for (Student student: lststudent) {
		  if(student.getSno()==sno){
			  objStudent=student;
		  }
		
	}
	  return objStudent;
  }
  public String deleteStudentDao(int sno){
	  String result="";
	  Student student=searchStudentDao(sno);
	  if(student!=null){
		  lststudent.remove(student);
		  result=rb.getString("del");;
		  return result;
	  }
	  else{
		  result= rb.getString("not");;
		  return result;
	  }
  }
  public String updateStudentDao(Student objStudent){
	  Student student=searchStudentDao(objStudent.getSno());
	  String result="";
	  if(student!=null){
		 for (Student s : lststudent) {
			 if(s.getSno()==objStudent.getSno()){
				 s.setSname(objStudent.getSname());
				 s.setCity(objStudent.getCity());
				 s.setCgpa(objStudent.getCgpa());
				 
			 }
			
		}
	
	  result= rb.getString("upd");;
	  }else{
		  result=rb.getString("not");;
		  }
	  return result;
  }
	  
  }
  