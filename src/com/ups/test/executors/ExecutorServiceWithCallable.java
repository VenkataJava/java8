package com.ups.test.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceWithCallable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Callable<Integer> task = () -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				return 1;
			} catch (InterruptedException e) {
				throw new IllegalStateException("task interrupted", e);
			}
		};
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Integer> future = executor.submit(task);
		System.out.println("future done? " + future.isDone());
		try {
			Integer resutlt = future.get();
			System.out.println("future done? " + future.isDone());
			System.out.print("result: " + resutlt);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
