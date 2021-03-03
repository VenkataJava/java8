package com.ups.test.java8;

import java.util.Arrays;
import java.util.List;

public class CountEmptyStringsfromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listString = Arrays.asList("abc", "", "def", "", "test", "");

		long count = listString.stream().filter(s -> s.isEmpty()).count();
		System.out.println("count of empty strings::-" + count);

	}

}