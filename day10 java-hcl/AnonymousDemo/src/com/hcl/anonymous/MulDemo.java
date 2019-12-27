package com.hcl.anonymous;

class Mul{
	synchronized void show(int n){
		int p;
		for(int i=1;i<=10;i++){
			p=n*i;
			System.out.println(n + " * " +i+ "=" +p);
		}	
	}
}
public class MulDemo {
	public static void main(String[] args) {
		Mul m=new Mul();
		Thread t=new Thread(){
			public void run(){
				m.show(5);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t1=new Thread(){
			public void run(){
				m.show(6);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t.start();
		t1.start();
		
	}
	}

	
