package com.ups.test.java8;

import java.util.Arrays;

public class CountofNFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 0, 0, 0, 1, 1, 1 };

		long count = Arrays.stream(arr).filter(a -> a == 1).count();
		System.out.println(count);
	}

}