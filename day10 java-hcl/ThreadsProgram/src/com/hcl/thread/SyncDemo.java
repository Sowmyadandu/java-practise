package com.hcl.thread;
class Demo{
	synchronized void dispMsg(String name){
		System.out.print("Hello "+ name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" how are u");
	}
}
class Sai extends Thread{
	Demo demo;
	Sai(Demo demo){
		this.demo=demo;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		demo.dispMsg("sai");
	}
}
class Teja extends Thread{
	Demo demo;
	Teja(Demo demo){
		this.demo=demo;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		demo.dispMsg("teja");
	}
}
class Sowmya extends Thread{
	Demo demo;
	Sowmya(Demo demo){
		this.demo=demo;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		demo.dispMsg("sOWMYA");
	}
}
public class SyncDemo {
public static void main(String[] args) {
	Demo demo=new Demo();
	Sai s=new Sai(demo);
	Teja t=new Teja(demo);
	Sowmya so=new Sowmya(demo);
	Thread t1=new Thread(s);
	Thread t2=new Thread(t);
	
	Thread t3=new Thread(so);
	
	t1.start();
	t2.start();
	t3.start();
	
	
}
}
