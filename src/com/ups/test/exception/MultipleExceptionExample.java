package com.ups.test.exception;

public class MultipleExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arr[] = new int[10];
			arr[10] = 30 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("In ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("In ArrayIndexOutOfBoundsException");
		} catch (Exception ex) {
			System.out.println("In exception");
		}
		
	}

}
