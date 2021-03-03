package com.ups.test.hacker;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("JAVA"));
	}

	public static String reverseString(String str) {
		if (str.isEmpty())
			return str;
		System.out.println(str.substring(1) + " ::: " + str.charAt(0));
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
