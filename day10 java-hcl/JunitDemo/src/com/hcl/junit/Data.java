package com.hcl.junit;

import java.util.HashMap;
import java.util.Map;

public class Data {
	public int sum(int a,int b){
		return a+b;
	}
	public String sayHello(){
		return "welcome to junit...";
	}
	public int max3(int a,int b,int c){
		int m=a;
		if(m<b){
			m=b;
		}
		if(m<c){
			m=c;
		}
		return m;
	}
	public int minArray(int[] x){
	int min=x[0];
	for(int i=0;i<x.length;i++){
		if(min>=x[i]){
			min=x[i];
		}
	}
	return min;
	}
	public boolean even(int x){
		if(x%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public String getProperty(String key){
		Map<String, String>m=new HashMap<String,String>();
		m.put("a", "b");
		m.put("b", "c");
		m.put("c", "d");
		m.put("d", "e");
		return m.get(key);
	}
}
