package com.hcl.inventory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class InventoryTest {
	static Inventory inventory=null;
	@BeforeClass
	public static void setup(){
	inventory=new Inventory();
	}


	
	@Test
	public void testGettersAndSetters() {
	inventory=new Inventory();
	inventory.setStockid("s001");
	inventory.setItemName("laptop");
	inventory.setPrice(56000.00);
	inventory.setQuantityAvail(12);
	assertEquals(1,inventory.getStockid());
	assertEquals("Pen",inventory.getItemName());
	assertEquals(56000.00,inventory.getPrice());
	assertEquals(12,inventory.getQuantityAvail());

	}

	}
