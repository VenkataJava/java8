package com.ups.test.hacker;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 123;
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			System.out.println("remainder::- " + remainder);
			reverse = reverse * 10 + remainder;
			System.out.println("reverse::- " + reverse);
			number = number / 10;
			System.out.println("number::- " + number);
			System.out.println("---------------------");	
		}
		System.out.println(reverse);
	}

}