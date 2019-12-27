package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSort {
public static void main(String[] args) {
	List<Product> list=new ArrayList<Product>();
	list.add(new Product(1, "Samsung A5", 17000));
	list.add(new Product(2, "i phone 6S", 65000));
	list.add(new Product(3, "Sony Xperia", 25000));
	list.add(new Product(4, "Nokia Lumia", 15000));
	list.add(new Product(5, "Redmi 4", 26000));
	list.add(new Product(6, "Lenevo Vibe", 19000));
//	Collections.sort(list, (p1,p2)->{
//		return p1.name.compareTo(p2.name);
//	});
	Collections.sort(list, (p1,p2)->{
		return (int) (p1.price-p2.price);
	});
	list.forEach(p->{
		System.out.println(p);
	});
}
}
