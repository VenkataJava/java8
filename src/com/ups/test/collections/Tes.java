package com.ups.test.collections;

public class Tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 100;
		Integer num2 = 100;
		if (num1 == num2) {
			System.out.println("numm equlas");
		} else {
			System.out.println("not equal");
		}

		m1(null);

		/*
		 * Integer i = new Integer(null); String s = new String(null); Double d = new
		 * Double(null);
		 */
		System.out.println("----");
		int var = 5;
		System.out.println(var++);
		System.out.println("\n" + ++var);
		Boolean b =true ?returnNull():false;
		System.out.println(b);
	}
	
	public static Boolean returnNull() {
		return null;
	}

	public static void m1(Object o) {
		System.out.println("object");
	}

	public static void m1(String s) {
		System.out.println("String");
	}

}
