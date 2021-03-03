package com.ups.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String concatString = CompareString("one", "two", "three");
		System.out.println("concatString::>> " + concatString);
		
		String concatStringResult = CompareStringUsingList("one", "two", "three");
		System.out.println("concatStringResult::>> " + concatStringResult);
		
		String concatStringVal = CompareStringUsingJava8("one", "two", "three");
		System.out.println("concatStringVal::>> " + concatStringVal);
	}

	public static String CompareStringUsingJava8(String firstString, String secondString, String thirdString) {
		Stream<String> stream = Stream.of(firstString,secondString,thirdString);
		return stream.sorted().collect(Collectors.joining());
	}

	public static String CompareStringUsingList(String firstString, String secondString, String thirdString) {
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>();
		list.add(firstString);
		list.add(secondString);
		list.add(thirdString);
		Collections.sort(list);
		for (String li : list) {
			sb.append(li);
		}
		return sb.toString();
	}

	public static String CompareString(String firstString, String secondString, String thirdString) {
		String topString = null;
		String middleString = null;
		String bottomString = null;
		StringBuilder sb = new StringBuilder();
		if (firstString.compareTo(secondString) > 0 && (firstString.compareTo(thirdString) > 0)) {
			topString = firstString;
		} else if (firstString.compareTo(secondString) < 0 && (firstString.compareTo(thirdString) > 0)) {
			middleString = firstString;
		} else {
			bottomString = firstString;
		}
		if (secondString.compareTo(firstString) > 0 && (secondString.compareTo(thirdString) > 0)) {
			topString = secondString;
		} else if (secondString.compareTo(firstString) < 0 && (secondString.compareTo(thirdString) > 0)) {
			middleString = secondString;
		} else {
			bottomString = secondString;
		}
		if (thirdString.compareTo(firstString) > 0 && (thirdString.compareTo(secondString) > 0)) {
			topString = thirdString;
		} else if (thirdString.compareTo(firstString) < 0 && (thirdString.compareTo(secondString) > 0)) {
			middleString = thirdString;
		} else {
			bottomString = thirdString;
		}
		return sb.append(firstString).append(secondString).append(thirdString).toString();
	}
}
