package com.hcl.day3;

public class Sbvalue {
	public StringBuilder show(String firstname, String lastname,String city,double cgp){
		StringBuilder sb=new StringBuilder();
		if(firstname.length() < 5){
			sb.append("Invalid firstname......");
		}
		if(lastname.length() < 5){
			sb.append("\n Invalid lastname.....");
		}
		if(city.length() < 5){
			sb.append("invalid city..............");
		}
		if(cgp >10){
			sb.append("\ninvalid cgp");
		}
		return sb;
	}
	public static void main(String[] args) {
		String firstname="Ram",lastName="kishan",city="Goa";
		double cgp=12.5;
		System.out.println(new Sbvalue().show(firstname, lastName, city, cgp));
	}

}
