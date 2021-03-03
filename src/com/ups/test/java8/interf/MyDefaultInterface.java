package com.ups.test.java8.interf;

public interface MyDefaultInterface {

	public static int num = 100;

	public default void display() {
		System.out.println("default method of MyInterface");
	}
}
