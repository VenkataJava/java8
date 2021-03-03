package com.ups.test.java8;

public class CountOccurrencesCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Count Occurrences of a Char in a String
		String someString = "elephant";
		long count = someString.chars().filter(s -> s == 'e').count();
		System.out.println("count:::--" + count);
	}

}
