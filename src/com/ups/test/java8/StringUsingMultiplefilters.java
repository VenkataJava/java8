package com.ups.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUsingMultiplefilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> stringList = Arrays.asList("virtusa123", "venkata", "virtusa234", "gurram");
		stringList = stringList.stream().filter(s -> s.length() > 4).filter(s -> s.startsWith("virtu"))
				.collect(Collectors.toList());
		stringList.forEach(System.out::println);
	}

}