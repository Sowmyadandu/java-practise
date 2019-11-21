package com.hcl.day3;

public class Max3 {
	
	public void check(int a,int b,int c){
		
		int z =(a>b && a>c)?a:(b>a && b>c)?b:c;
		
		System.out.println("Max number is "+z);
	}
	public static void main(String[] args) {
		int a,b,c;
		a=5;
		b=6;
		c=27;
		
		Max3 obj=new Max3();
		obj.check(a, b, c);
	}

}
