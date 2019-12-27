package com.hcl.thread;

class Mtable{
	void show(int n){
		int p;
		for(int i=1;i<=10;i++){
			p=n*i;
			System.out.println(n + " * " +i+ "=" +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Tab1 extends Thread{
	Mtable m;
	Tab1(Mtable m){
		this.m=m;
	}
	@Override
	public void run() {
		m.show(12);
	}
	
	
}
class Tab2 extends Thread{
	Mtable m;
	Tab2(Mtable m){
		this.m=m;
	}
	@Override
	public void run() {
		m.show(5);
	}
	
	
}
public class ThrTable {
	public static void main(String[] args) {
		Mtable m=new Mtable();
		Thread t1=new Thread(new Tab1(m));
		Thread t2=new Thread(new Tab2(m));
		t1.start();
		t2.start();
	}
	

}
