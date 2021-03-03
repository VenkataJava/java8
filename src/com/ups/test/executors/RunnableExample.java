package com.ups.test.executors;

import java.util.concurrent.TimeUnit;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("hello " + threadName);
		};
		task.run();
		Thread thread = new Thread(task);
		thread.start();
		System.out.println("Done");

		Runnable runnable = () -> {
			try {
				String name = Thread.currentThread().getName();
				System.out.println("Foo " + name);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Bar " + name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
	}
}
