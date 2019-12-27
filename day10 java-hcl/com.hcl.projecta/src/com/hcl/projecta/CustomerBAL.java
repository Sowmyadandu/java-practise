package com.hcl.projecta;

import java.util.List;






public class CustomerBAL {
	
		static StringBuilder sb=new StringBuilder();
		public void writeCustomerFileBal() {
			new CustomerDAO().writeCustomerFileDao();
		}

		public void readCustomerFileBal() {
			new CustomerDAO().readCustomerFileDao();
		}
		public boolean addCustomerBal(Customer objCustomer) throws CustomerException{
			boolean isAdded=true;
			if(objCustomer.getCustId()<=0){
				sb.append("custid cannot be negative or zero \r \n");
				isAdded=false;
			}
			if(objCustomer.getCustName().length()<=4){
				sb.append("name more than 5 characters \r \n");
				isAdded=false;
			}
			if(objCustomer.getAnnualPremium()<=20000 || objCustomer.getAnnualPremium()>=100000){
				sb.append("annual premium is not in range\r \n");
				isAdded=false;
			}
			if(objCustomer.getModalPremium()<=1000 || objCustomer.getModalPremium()>=50000){
				sb.append("modal premium is not in range\r \n");
				isAdded=false;
			}
			if(objCustomer.getPaymentMode()<1 ||objCustomer.getPaymentMode()>3 ){
				sb.append("wrong payment mode\r \n");
				isAdded=false;
			}
			if(isAdded==false){
				throw new CustomerException(sb.toString());
			}
			else{
				new CustomerDAO().addCustomerDao(objCustomer);
			}
			return isAdded;
		}
		public List<Customer> showCustomerBal(){
			return new CustomerDAO().showCustomerDao();
		}
		public Customer searchCustomerBal(int custId){
			return new CustomerDAO().searchCustomerDao(custId);
			
		}
		public String updateCustomerBal(Customer objCustomer){
			return new CustomerDAO().updateCustomerDao(objCustomer);
		}
		public String deleteCustomerBal(int custId){
			return new CustomerDAO().deleteCustomerDao(custId);
		}

}
