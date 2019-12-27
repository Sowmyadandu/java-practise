package com.hcl.projecta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	

		@Test
		public void testToString() {
//			Customer [custId=" + custId + ", custName=" + custName
//					+ ", annualPremium=" + annualPremium + ", modalPremium="
//					+ modalPremium + ", paymentMode=" + paymentMode + "]";
		Customer objCustomer=new Customer();
		objCustomer.setCustId(12);
		objCustomer.setCustName("sowmya");
		objCustomer.setAnnualPremium(25000);
		objCustomer.setModalPremium(4000);
		objCustomer.setPaymentMode(1);
		assertEquals("Customer [custId=12, custName=sowmya, annualPremium=25000.0, modalPremium=4000.0, paymentMode=1]",objCustomer.toString()); 
		
		}
		@Test
		public void testGettersAndSetters(){
		Customer objCustomer=new Customer();
		
		objCustomer.setCustId(12);
		objCustomer.setCustName("sowmya");
		objCustomer.setAnnualPremium(25000);
		objCustomer.setModalPremium(4000);
		objCustomer.setPaymentMode(1);
		
         assertEquals(12,objCustomer.getCustId());
		assertEquals("sowmya",objCustomer.getCustName());
		assertEquals(25000,objCustomer.getAnnualPremium(),0);
		assertEquals(4000,objCustomer.getModalPremium(),0);
		assertEquals(1,objCustomer.getPaymentMode(),0);
		
		
		}
		

}
