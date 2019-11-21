package com.hcl.day3;

public class CentitoFore {
	public void calc(double c){
		double f =((9*c)/5)+32;
		System.out.println("Fahrenheit value " +f);
		
	}
	public static void main(String[] args) {
		double c=37;
		CentitoFore obj= new CentitoFore();
		obj.calc(c);
	}

}
