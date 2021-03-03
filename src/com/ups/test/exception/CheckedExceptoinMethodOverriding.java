package com.ups.test.exception;

import java.io.IOException;

public class CheckedExceptoinMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class base {
	// SuperClass doesn't declare any exception
	void m1() {
	}
}

class derived extends base {
	// method() declaring Checked Exception IOException
	// IOException is of type Checked Exception
	// so the compiler will give Error
	void m1() throws IOException {

	}
}
