package com.hcl.anonymous;
 interface Itraining{
	 void name();
	 void email();
	 
 }
public class Demo1 {
public static void main(String[] args) {
	Itraining obj=new Itraining() {
		
		@Override
		public void name() {
			// TODO Auto-generated method stub
			System.out.println("name is hcl");
		}
		
		@Override
		public void email() {
			// TODO Auto-generated method stub
			System.out.println("admin@hcl.com");
		}
	};
	obj.name();
	obj.email();
}
}
