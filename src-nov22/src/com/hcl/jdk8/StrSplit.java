package com.hcl.jdk8;

public class StrSplit {
	void show(){
	String names="mmm nnn ooo ppppp";
	String[] list=names.split(" ");
	for (String stri : list) {
		System.out.println(stri);
	}
	}
	public static void main(String[] args) {
		StrSplit s=new StrSplit();
		s.show();
	}

}
