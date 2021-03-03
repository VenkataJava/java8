package com.ups.test.string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n1 = "John";
		String n2 = "jo" + "hn";
		String n3 = "jo".concat("hn");
		System.out.println(n1 == n2);
		System.out.println(n1 == n3);
		System.out.println(n2 == n3);
		
	}

}
