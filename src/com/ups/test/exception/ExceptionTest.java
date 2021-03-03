package com.ups.test.exception;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new IOException("Sample");
		} catch (IOException | Exception e) {
			System.out.println("In catch block");
		}
	}

}
