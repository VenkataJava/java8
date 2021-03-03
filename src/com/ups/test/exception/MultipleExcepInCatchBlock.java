package com.ups.test.exception;

public class MultipleExcepInCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | Exception e) {
			System.out.println("In Single Catch Block");
		}
	}

}
