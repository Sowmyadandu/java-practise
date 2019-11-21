package com.hcl.day3;

public class Factorial {
	
	public void show(int n){
		
		int out=1;	
		while(n>0){
			out=out*n;
			n--;
		}
		System.out.println("Factorial of n is " +out);
		
	}
	
	public static void main(String[] args) {
		int n=6;
		new Factorial().show(n);
	}

}
