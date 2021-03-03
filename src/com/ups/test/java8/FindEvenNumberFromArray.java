package com.ups.test.java8;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(7, 4, 5, 8, 11, 13, 16);
		numbers.stream().filter(n -> n % 2 == 0).filter(n -> n > 10).forEach(System.out::println);
		Integer resultVal = numbers.stream().filter(n -> n % 2 == 0).filter(n -> n > 10).findFirst().get();
		System.out.println("val:: " + resultVal);

		int[] val = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = Arrays.stream(val).reduce(0, (a, b) -> a + b); // 55
		int sum2 = Arrays.stream(val).reduce(0, Integer::sum);
	}

}