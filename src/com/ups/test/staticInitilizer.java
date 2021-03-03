package com.ups.test;

public class staticInitilizer {

	private static int x = 1;
	static {
		System.out.println("In static block");
	}

	public staticInitilizer() {
		System.out.println("In Constructor");
	}

	public static void m1() {
		System.out.println("In m1() method");
		synchronized (staticInitilizer.class) {

		}
	}

	{
		System.out.println("In Instance Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main Method");
		new staticInitilizer();
		m1();
	}
}
