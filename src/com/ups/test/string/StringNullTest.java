package com.ups.test.string;

public class StringNullTest {

	/*
	 * public StringNullTest() {
	 * 
	 * }
	 */

	public StringNullTest(String str) {
		System.out.println("In String");
	}

	public StringNullTest(Integer i) {
		System.out.println("In Integer");
	}

	public StringNullTest(Double i) {
		System.out.println("In Double");
	}

	public StringNullTest(Long i) {
		System.out.println("In Long");
	}

	public StringNullTest(Object str) {
		System.out.println("In String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringNullTest test = new StringNullTest(null);

	}

}