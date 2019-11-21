package com.hcl.day3;

public class StrDemo {
	public void show(){
		String msg="Welcome to java programming...from hcl";
		System.out.println("Length...."+msg.length());
		System.out.println("1st occurence of 'a' is.... "+msg.indexOf('a'));
		System.out.println("lat occurence of 'a' is...... "+msg.lastIndexOf('a'));
		System.out.println("1st occurence of 'z' is...."+msg.indexOf('z'));
		System.out.println("Char at 5th position....."+msg.charAt(5));
		System.out.println("Lower case......"+msg.toLowerCase());
		System.out.println("Upper case...."+msg.toUpperCase());
		System.out.println("Substring......"+msg.substring(1,10));
		System.out.println("Starts with ....."+msg.startsWith("Welcome"));
		System.out.println("Starts with... "+msg.startsWith("Hello"));
		System.out.println("Concat string......"+msg.concat("OMR"));
		System.out.println("Replaced string ......"+msg.replace("java", "J2EE"));
	}
	public static void main(String[] args) {
		new StrDemo().show();
	}

}
