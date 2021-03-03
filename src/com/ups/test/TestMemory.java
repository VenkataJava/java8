package com.ups.test;

public class TestMemory {

	static int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (i < 25) {
			i++;
			System.out.println(i);
			main(new String[] { (args[0] + args[0]).intern() });
		}
	}

}
