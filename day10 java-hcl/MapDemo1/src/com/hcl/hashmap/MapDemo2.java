package com.hcl.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Double> m=new Hashtable<String,Double>();
		m.put("aaaa",1.9);
		m.put("bbbb",1.8);
		m.put("cccc",1.7);
		m.put("dddd",1.6);
		m.put("eeee",1.5);
		String key;
		Double value;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key ");
		key=sc.nextLine();
		value=m.getOrDefault(key, 0.0);
		System.out.println(value);
	}

}
