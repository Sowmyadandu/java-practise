package com.hcl.day3;

public class StringbExam {
	public void show() {
		StringBuilder sb=new StringBuilder("Welcome to Java");
		System.out.println(sb);
		sb.append("From hacl..all the best..");
		System.out.println(sb);
		sb.insert(3, "Sneha");
		System.out.println(sb);
		sb.delete(3,8);
		System.out.println(sb);
		sb.append("\t First name validation failed........");
		System.out.println(sb);
		sb.append("\t Last name validation failed.........");
		System.out.println(sb);
	}
	public static void main(String[] args) {
		new StringbExam().show();
	}

}
