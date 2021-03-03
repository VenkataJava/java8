package com.ups.test.hacker;

public class findMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1[] = { 4, 3, 5 };
		String input2 = "PNP";
		int input3 = 3;
		int result = findMaximum(input1, input2, input3);
		System.out.println(result);
	}

	public static int findMaximum(int input1[], String input2, int input3) {
		int sum = 0;
		for (int i = 0; i < input3; i++) {
			char ch = input2.charAt(i);
			if (ch == 'P') {
				sum += input1[i];
			} else {
				sum -= input1[i];
			}
		}
		return sum * 100;
	}
}
