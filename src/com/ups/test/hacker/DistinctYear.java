package com.ups.test.hacker;

import java.util.HashSet;
import java.util.Set;

public class DistinctYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "UN was established on 24-10-1945." + "India got freedom on 15-08-1947.";
		System.out.println(distinct_year(str));

	}

	public static int distinct_year(String str) {

		String str1 = "";
		Set<String> uniqueYear = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				str1 += (str.charAt(i));
				System.out.println("Test::--- " + str1);
			}

			if (str.charAt(i) == '-') {
				str1 = "";
			}
			if (str1.length() == 4) {
				uniqueYear.add(str1);
				str1 = "";
			}
		}
		return uniqueYear.size();
	}

}
