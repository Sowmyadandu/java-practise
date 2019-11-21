package com.hcl.day3;

public class CircleDemo {
	
	public void calc(double radius){
		double area,circ;
		area=Math.PI * Math.pow(radius, 2);
		circ=2*Math.PI*radius;
		System.out.println("Area of Circle " +area);
		System.out.println("Circumstance of circle " +circ);
		
	}
	public static void main(String[] args) {
		double radius=12.5;
		CircleDemo obj = new CircleDemo();
		obj.calc(radius);
		
	}

}
