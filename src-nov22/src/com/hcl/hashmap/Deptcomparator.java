package com.hcl.hashmap;

import java.util.Comparator;

public class Deptcomparator implements Comparator<Employ> {

	@Override
	public int compare(Employ e1, Employ e2) {
		return e1.dept.compareTo(e2.dept);
	}

	
	
		
		}

