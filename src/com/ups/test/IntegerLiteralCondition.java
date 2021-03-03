package com.ups.test;

public class IntegerLiteralCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double d1 = 100.00;
		Double d2 = 100.00;

		if (d1 == d2) {
			System.out.println("double equals");
		} else {
			System.out.println("double not equsl");
		}

		Float f1 = 100.00f;
		Float f2 = 100.00f;

		if (f1 == f2) {
			System.out.println("float equals");
		} else {
			System.out.println("float not equsl");
		}

		Integer i1 = 100;
		Integer i2 = 100;

		if (i1 == i2) {
			System.out.println("integer equals");
		} else {
			System.out.println("integer not equsl");
		}
	}

}