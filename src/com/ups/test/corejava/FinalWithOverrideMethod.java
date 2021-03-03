package com.ups.test.corejava;

public class FinalWithOverrideMethod {

	// public ,protected,private permitted
	public final FinalWithOverrideMethod() {
		final String str = "abc";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.draw();
		A a = new B();
		a.draw();
	}
}

class A {
	final public void draw() {
		System.out.println("A");
	}
}

class B extends A {
	// final keyword with override method
	public void draw() {
		System.out.println("B");
	}
}