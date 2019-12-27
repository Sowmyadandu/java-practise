package com.hcl.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {
	public static void main(String[] args) {
		Map names=new HashMap();
		names.put("1", "hhhh");
		names.put("2", "iiii");
		names.put("3", "jjjj");
		names.put("4", "kkkk");
		names.put("5", "llll");
		String key,value;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key ");
		key=sc.nextLine();
		value=(String)names.getOrDefault(key, "not found");
		System.out.println(value);
	}

}
