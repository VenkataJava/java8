package com.ups.test.java8;

import java.util.Arrays;

public class ReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i <= numbers.length; i++) {
			sum += i;
		}
		System.out.println("sum:: " + sum);

		int result = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		System.out.println("result:: " + result);

		int result1 = Arrays.stream(numbers).reduce(0, Integer::sum);
		System.out.println("result11:: " + result1);

	}

}