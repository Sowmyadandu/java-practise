package com.hcl.projecta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class CustomerDAO {
	 static List<Customer> lstcustomer = null;

static{
	  lstcustomer=new ArrayList<Customer>();
}
public void readCustomerFileDao() {
	try {
		FileInputStream fin=new FileInputStream("c:/files/customer.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		lstcustomer =(List<Customer>)objin.readObject();
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

public void writeCustomerFileDao() {
	try {
		FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(lstcustomer);
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

public String addCustomerDao(Customer customer){
	lstcustomer.add(customer);
	return"customer created successfully.....";
  }
public List<Customer> showCustomerDao() {
	  return lstcustomer;
	  }

public Customer searchCustomerDao(int custId){
	 Customer objCustomer=null;
	  for (Customer customer: lstcustomer) {
		  if(customer.getCustId()==custId){
			  objCustomer=customer;
		  }
		
	}
	  return objCustomer;
}
public String deleteCustomerDao(int custId){
	  String result="";
	  Customer customer=searchCustomerDao(custId);
	  if(customer!=null){
		  lstcustomer.remove(customer);
		  result="customer record deleted successfully";
		  return result;
		  
	  }
	  else{
		  result="customer record not found";
		  return result;
	  }
}
public String updateCustomerDao(Customer objCustomer){
	 Customer customer=searchCustomerDao(objCustomer.getCustId());
	  String result="";
	  if(customer!=null){
		 for (Customer s : lstcustomer) {
			 if(s.getCustId()==objCustomer.getCustId()){
				 s.setCustName(objCustomer.getCustName());
				 s.setAnnualPremium(objCustomer.getAnnualPremium());
				 s.setModalPremium(objCustomer.getModalPremium());
				 s.setPaymentMode(objCustomer.getPaymentMode());
				 
			 }
			
		}
	
	  result="customer record updated";
	  }else{
		  result="customer record not found";
		  }
	  return result;
}
}