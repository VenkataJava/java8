package com.ups.test.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class StringCountDuplicateCharJava8Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCountOfDuplicateCharJava8Stream("bbbcccccddddddaaaa");
	}

	public static void printCountOfDuplicateCharJava8Stream(String str) {

		Map<Character, Long> map = str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		System.out.println(map);
	}

}
