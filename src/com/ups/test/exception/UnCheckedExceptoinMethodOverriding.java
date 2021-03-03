package com.ups.test.exception;

import java.io.IOException;

public class UnCheckedExceptoinMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base s = new base();
		s.m1();
	}
}

class base {
	void m1() {
		System.out.println("In base m1() method");
	}
}

class derived extends base {

	// method() declaring Checked Exception ArithmeticException
	// ArithmeticException is of type Unchecked Exception
	// so the compiler won't give any error
	void m1() throws ArithmeticException {
		System.out.println("In dervived m1() method");
	}
}
