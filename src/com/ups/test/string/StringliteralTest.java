package com.ups.test.string;

public class StringliteralTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = "world";
		String s3 = s2;
		System.out.println(s3);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		
		String str = "234";
		Double d = Double.parseDouble(str);
		System.out.println(d);
	}
}