package com.ups.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetCountOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aa bb cc    kk gg ll aa    kk";
		System.out.println(str.split("\\s+").length);

		int count = wordCount(str);
		System.out.println(count);

		List<String> wordsList = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");
		Map<String, Long> wordsCount = wordsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(wordsCount);
		System.out.println(wordCount(str));
	}

	public static int wordCount(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ' && i < str.length() - 1 && str.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count;
	}
}
