package com.ups.test.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetCountOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aa bb cc    kk gg ll aa    kk";
		System.out.println("word count using regular expression::--- " + str.split("\\s+").length);

		int count = wordCount(str);
		System.out.println("word count using conditions::-- " + count);

		List<String> wordsList = Arrays.asList("Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Orange",
				"Mango", "Mango", "PineApple");
		Map<String, Long> wordsCount = wordsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("unsorted by values in descending order:" + wordsCount);

		Map<String, Long> sortedByValue = wordsCount.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(
						Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println("sorting by values in descending order:" + sortedByValue);
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
