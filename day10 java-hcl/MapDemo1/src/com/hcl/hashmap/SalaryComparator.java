package com.hcl.hashmap;

import java.util.Comparator;

public class SalaryComparator  implements Comparator<Employ>{

	@Override
	public int compare(Employ o1, Employ o2) {
		if(o1.salary>=o2.salary){
			return 1;
		}
		else{
			return -1;
		}
	}

	
	
}
