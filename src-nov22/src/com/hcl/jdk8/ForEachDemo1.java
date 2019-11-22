package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo1 {
public static void main(String[] args) {
	List<String> name=new ArrayList<String>();
	name.add("sow");
	name.add("abc");
	name.add("def");
	name.add("ghi");
	name.add("jkl");
	
	List<Integer>num=new ArrayList<Integer>();
	num.add(new Integer(88));
	num.add(new Integer(87));
	num.add(new Integer(86));
	num.add(new Integer(85));
	
	num.forEach(p -> {
		if(p > 50){
			System.out.println(p);
		}
	});
	
}
}
