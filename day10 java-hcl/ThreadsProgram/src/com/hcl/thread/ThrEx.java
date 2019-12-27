package com.hcl.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

class Thr1 implements Runnable{

	@Override
	public void run() {
		List<String > names=new ArrayList<String>();
		names.add("s");
		names.add("o");
		names.add("w");
		names.add("m");
		names.add("y");
		names.add("a");
		for (String s : names) {
			System.out.println("array list"+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
class Thr2 implements  Runnable {
	public void run() {
		SortedSet<String > names=new TreeSet<String>();
		names.add("s");
		names.add("u");
		names.add("m");
		names.add("a");
		names.add("n");
		names.add("t");
		names.add("h");
		for (String s : names) {
			System.out.println("treeset "+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
class Thr3 implements Runnable{

	@Override
	public void run() {
	Vector<String> names=new Vector<String>(3,2);
	names.add("s");
	names.add("u");
	names.add("r");
	names.add("e");
	names.add("s");
	names.add("h");
	for (String s : names) {
		System.out.println("vector  "+s);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	
}
public class ThrEx {
	public static void main(String[] args) {
		Thr1 t1=new Thr1();
		Thr2 t2=new Thr2();
		Thr3 t3=new Thr3();
		Thread t=new Thread(t1);
		Thread ta=new Thread(t2);
		Thread tb=new Thread(t3);
		t.start();
		ta.start();
		tb.start();
	
	}

}
