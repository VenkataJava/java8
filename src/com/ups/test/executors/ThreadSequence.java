package com.ups.test.executors;

public class ThreadSequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeqRun sr = new SeqRun();
		Thread t1 = new Thread(sr);
		Thread t2 = new Thread(sr);
		Thread t3 = new Thread(sr);
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class SeqRun implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In run method " + Thread.currentThread().getName());
	}
}
