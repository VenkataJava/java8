package com.ups.test;

public class Test extends Throwable {

	public Test() {
		synchronized (s1) {
			System.out.println("Test object");
		}
	}

	private transient static String s1 = "java";
	private String s2 = "scala";

	public static void java() {
		System.out.println(s1);
	}

	public static void scala() {
		// System.out.println(s2);
	}

	public static void main(String[] args) {
		Test t = new Test();
		boolean flag = true;
		if (flag) {
		System.out.println("hiii");
			break;
		}

	}
}
