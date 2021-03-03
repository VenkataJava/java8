package com.ups.test.thread;

public class SampleThread extends Thread {
	public static void main(String[] args) {
		SampleThread thread = new SampleThread();
		thread.start();
		System.out.println("This code is outside of the thread");
	}

	public void run() {
		System.out.println("This code is running in a thread");
	}
}