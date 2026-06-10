package com.ibm.demo.day3.classes;

public class Worker	implements Runnable{

	@Override
	public void run() {
		method();
		
	}
	public void method() {
		for(int i =0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"  Working...");
		}
	}

}
