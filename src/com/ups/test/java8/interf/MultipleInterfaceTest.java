package com.ups.test.java8.interf;

public class MultipleInterfaceTest implements A, B {

	/*@Override
	public void print() {
		// TODO Auto-generated method stub
		A.super.print();
		B.super.print();
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultipleInterfaceTest().print();
	}

}

interface A {
	default public void print() {
		System.out.println("In A interface");
	}
}

interface B {

	default public void print() {
		System.out.println("In B interface");
	}

}
