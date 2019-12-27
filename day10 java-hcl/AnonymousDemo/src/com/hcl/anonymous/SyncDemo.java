package com.hcl.anonymous;

class Demo{
	synchronized void dispMsg(String name){
		System.out.println("hello "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class SyncDemo {
	public static void main(String[] args) {
		Demo d=new Demo();
		Thread t1=new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				d.dispMsg("sowmya");
			}
		};
		Thread t2=new Thread(){
			public void run() {
				d.dispMsg("sss");
			}
		};
		t1.start();
		t2.start();
	}

}
