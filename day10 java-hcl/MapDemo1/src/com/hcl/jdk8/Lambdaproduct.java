package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.List;

public class Lambdaproduct {
public static void main(String[] args) {
	List<Product> list=new ArrayList<Product>();
	list.add(new Product(1, "Samsung A5", 17000));
	list.add(new Product(2, "i phone 6S", 65000));
	list.add(new Product(3, "Sony Xperia", 25000));
	list.add(new Product(4, "Nokia Lumia", 15000));
	list.add(new Product(5, "Redmi 4", 26000));
	list.add(new Product(6, "Lenevo Vibe", 19000));
//	list.stream().filter(p-> p.price>=20000).forEach(x->{
//		System.out.println(x);
//	});
	list.stream().filter(h-> h.name.startsWith("S")).forEach(m->{
		System.out.println(m);
	});
	System.out.println(" max price mobile \n ....");
	Product maxProduct=list.stream().max((p1,p2)->p1.price>=p2.price?1:-1).get();
	System.out.println(maxProduct);
	Product minProduct=list.stream().min((p1,p2)->p1.price>=p2.price?1:-1).get();
	System.out.println(minProduct);
	System.out.println("first 3 records");
	list.stream().limit(3).forEach(p ->{
		System.out.println(p);
	});
	System.out.println("after skipping  records");
	list.stream().skip(2).forEach(p ->{
		System.out.println(p);
	});
}
}
