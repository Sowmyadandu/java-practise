package com.hcl.bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTestCase {
static Account account=null;
@Before
public static void setUp()
{
	account=new Account();
}
	@Test
	public void testGettersAndSetters()
	{
		account=new Account();
		account.setAccountNo(1);
		account.setFirstName("sravani");
		account.setLastName("HCL");
		account.setCity("chennai");
		account.setState("TN");
		account.setAmount(77444);
		account.setCheqFacil("Yes");
		account.setAccountType("Savings");
		assertEquals(1,account.getAccountNo());
		assertEquals("Sravani" ,account.getFirstName());
		assertEquals("HCL" ,account.getLastName());
		assertEquals("chennai" ,account.getCity());
		assertEquals("TN" ,account.getState());
		assertEquals(77444 ,account.getAmount());
		assertEquals("Yes" ,account.getCheqFacil());
		assertEquals("Savings" ,account.getAccountType());
		
				
		
	}

}
