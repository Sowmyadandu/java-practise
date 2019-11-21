package com.hcl.day3;

public class Evenodd {
	
	public void check(int n){
		if(n%2==0){
			System.out.println("even number...");
		}else{
			System.out.println("odd number.....");
		}
	}
	public static void main(String[] args) {
		int n=67;
		Evenodd obj=new Evenodd();
		//int num=Integer.parseInt(args[0]);
		obj.check(n);
		
	}

}

