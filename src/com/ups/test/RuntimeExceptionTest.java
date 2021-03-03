package com.ups.test;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b, c = 2;
		int sum = 0;
		try {
			if (a > c)
				throw new RuntimeException();
			b = 1;
		} catch (RuntimeException r) {
			sum = a + b + c;
		}
		System.out.println(sum);
	}

}
