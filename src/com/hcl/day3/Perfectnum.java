package com.hcl.day3;

public class Perfectnum {
	public void check(int n){
		int orig=n;
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
				
			}
		}
		System.out.println("\nsum of factors  "+sum);
		if(sum==orig){
			
			System.out.println("\nperfect number......... "+orig);
		}else{
			System.out.println("not a perfect number....");
		}
	}
	
	public static void main(String[] args) {
		int n=27;
		new Perfectnum().check(n);
	}

}
