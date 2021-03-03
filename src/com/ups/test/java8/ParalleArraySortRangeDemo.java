package com.ups.test.java8;

import java.util.Arrays;

public class ParalleArraySortRangeDemo {

	public static void main(String[] args) {

		int[] intArray = { 18, 1, 14, 2, 15, 12, 5, 4 };

		System.out.println("Array Length " + intArray.length);
		System.out.println("---Before Parallel Sort---");

		for (int i : intArray)
			System.out.print(i + " ");

		// Parallel Sorting
		Arrays.parallelSort(intArray, 0, 4);

		System.out.println("\n---After Parallel Sort---");
		for (int i : intArray)
			System.out.print(i + " ");

	}
}