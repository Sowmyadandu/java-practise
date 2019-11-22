package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySort {
	public static void main(String[] args) {
		List<Employ>e=new ArrayList<Employ>();
		e.add(new Employ(1,"ddd","java","sw",91230));
		e.add(new Employ(2,"bbb","c","an",15430));
		e.add(new Employ(1,"ccc","java","tl",71830));
		e.add(new Employ(1,"aaa","c","sof",61430));
		e.add(new Employ(1,"eee","java","sr.an",19300));
		System.out.println("sort name wise");
	Collections.sort(e, (p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		e.forEach(p->{
			System.out.println(p);
		});
		e.stream().filter(h-> h.dept.startsWith("java")).forEach(m->{
			System.out.println(m);
		});
		e.stream().filter(p-> p.basic>50000).forEach(x->{
			System.out.println(x);
	});
		Employ maxBasic=e.stream().max((p1,p2)->p1.basic>=p2.basic?1:-1).get();
		System.out.println(maxBasic);
	
	Employ minBasic=e.stream().min((p1,p2)->p1.basic>=p2.basic?1:-1).get();
	System.out.println(minBasic);
	e.stream().limit(3).forEach(p ->{
		System.out.println(p);
	});
	
	System.out.println("Sorted Data ");
	
	Collections.sort(e, (e1, e2) -> {
		return (int) (e2.basic - e1.basic);
	});
	
	e.stream().forEach(p -> {
		System.out.println(p);
	});
	System.out.println("Data after skipping top 2 records ");
	e.stream().skip(2).forEach(p -> {
		System.out.println(p);
	});
	Collections.sort(e, (p1,p2)->{
		return (int) (p1.basic-p2.basic);
	});
	e.forEach(p->{
		System.out.println(p);
	});
	int sum=e.stream().reduce(0,(e1,e2)->(int)e1.basic+(int)e2.basic{
		System.out.println((int)sum);
	});
}
}
