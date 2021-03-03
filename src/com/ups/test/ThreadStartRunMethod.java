package com.ups.test;

public class ThreadStartRunMethod implements Runnable {

	public void start() {
		System.out.println("start method");
	}

	public void run() {
		System.out.println("run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadStartRunMethod t1 = new ThreadStartRunMethod();
		ThreadStartRunMethod t2 = new ThreadStartRunMethod();
		Thread t3 = new Thread(t1);

		t3.start();
		//t3.start();

		t3.run();
		t3.run();
		System.out.println("----------------");
		
		t1.start();
		t2.start();

		t1.run();
		t2.run();
	}
}
