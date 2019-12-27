package com.hcl.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestData {
   static Data data;
   @BeforeClass
   public static void setUp(){
	   data=new Data();
	   }	
   @Test
	public void testSayHello() {
		Data data=new Data();
		assertEquals("welcome to junit...", data.sayHello());
	}
	@Test
	public void testsum(){
		assertEquals( 5, data.sum(3, 2));
		
		
	}
	@AfterClass
	public static void tearDown(){
		data=null;
	}
	@Test
	public void testMax3(){
		assertEquals( 5, data.max3(5,2,3));
		assertEquals( 5, data.max3(2,5,3));
		assertEquals( 5, data.max3(2,3,5));
	}
	@Test
	public void minArray(){
		assertEquals(-1, data.minArray(new int
				[]{4,-1,7,2,35}));
	}
	@Test
	public void even(){
		assertTrue( data.even(8));
		assertFalse(data.even(9));
	}
	@Test
	public void testGetProperty()
	{
		assertNull(data.getProperty("e"));
		assertNotNull(data.getProperty("d"));
	}
}
