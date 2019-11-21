package com.hcl.day3;

public class PosNeg {
	
	public void check(int n){
		if(n > 0){
			System.out.println("positifve no..... ");
		}else{
			System.out.println("negative no......");
		}
	}
	public static void main(String[] args) {
		int n=5;
		PosNeg obj=new PosNeg();
		obj.check(n);
		
		
	}

}
