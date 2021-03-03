package com.ups.test.java8;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "blast";
		String reverseStr = IntStream.range(0, str.length()). // create index [0 .. s.length - 1] 
		   boxed().                               // the next step requires them boxed
		   sorted(Collections.reverseOrder()).    // indices in reverse order
		   map(i -> String.valueOf(str.charAt(i))). // grab each index's character 
		   collect(Collectors.joining());         // join each single-character String into the final String
		System.out.println("reverseStr::-- " + reverseStr);
	}

}
