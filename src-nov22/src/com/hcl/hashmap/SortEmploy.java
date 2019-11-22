package com.hcl.hashmap;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	
		public static void main(String[] args) {
			Comparator c=new Deptcomparator();
			
			SortedSet s=new TreeSet(c);
//     Comparator c1=new SalaryComparator();
//			
//			SortedSet s=new TreeSet(c1);
			
			SortedSet<Employ> employ=new TreeSet<Employ>();
			employ.add(new Employ(1,"sowmya","n","sw",7.8));
			employ.add(new Employ(2,"jkl","m","swe",7.8));
			employ.add(new Employ(3,"abc","o","sw",7.8));
			employ.add(new Employ(4,"def","l","ta",7.8));
			employ.add(new Employ(5,"ghi","k","leader",7.8));
			
	  for(Employ emp:employ){
		  System.out.println(emp);
	  }
		  
	}

	
}
