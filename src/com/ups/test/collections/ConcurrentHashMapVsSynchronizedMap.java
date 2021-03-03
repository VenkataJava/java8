package com.ups.test.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapVsSynchronizedMap {

	public final static int THREAD_POOL_SIZE = 5;
	public static Map<String, Integer> hashTableObject = null;
	public static Map<String, Integer> synchronizedMapObject = null;
	public static Map<String, Integer> concurrentHashMapObject = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		hashTableObject = new Hashtable<>();
		mapPeroformTest(hashTableObject);
		synchronizedMapObject = Collections.synchronizedMap(new HashMap<>());
		mapPeroformTest(synchronizedMapObject);
		concurrentHashMapObject = new ConcurrentHashMap<String, Integer>();
		mapPeroformTest(concurrentHashMapObject);
	}

	public static void mapPeroformTest(final Map<String, Integer> mapObj) throws InterruptedException {
		System.out.println("Test started for: " + mapObj.getClass());
		long averageTime = 0;
		for (int i = 0; i < 5; i++) {
			long startTime = System.nanoTime();
			ExecutorService executors = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
			for (int j = 0; j < THREAD_POOL_SIZE; j++) {
				executors.execute(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for (int i = 0; i < 500000; i++) {
							Integer randomNumber = (int) Math.ceil(Math.random() * 550000);
							Integer value = mapObj.get(String.valueOf(randomNumber));
							mapObj.put(String.valueOf(randomNumber), randomNumber);
						}
					}
				});
			}
			executors.shutdown();
			executors.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
			long endTime = System.nanoTime();
			long totalTime = (endTime - startTime) / 1000000L;
			averageTime += totalTime;
			System.out.println("500K entried added/retrieved in " + totalTime + " ms");
		}
		System.out.println("For " + mapObj.getClass() + " the average time is " + averageTime / 5 + " ms\n");
	}
}
