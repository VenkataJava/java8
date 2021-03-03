package com.ups.test.corejava;

public class ArrayIncrementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1 };
		increment(a);
		System.out.println(a[a.length - 1]);
	}

	public static void increment(int[] i) {
		i[i.length - 1]++;
	}

}
