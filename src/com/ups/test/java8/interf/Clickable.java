package com.ups.test.java8.interf;

public interface Clickable {

	default void click() {
		System.out.println("click");
	}

	default void print() {
		System.out.println("Clickable");
	}
}