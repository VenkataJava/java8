package com.ups.test.collections;

public class ArrayListCustomApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListCustom<Integer> list = new ArrayListCustom<Integer>();
		// Add elements in custom ArrayList
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		// Display custom ArrayList
		list.display();
		System.out.println("\nelement at index in custom ArrayList > " + 1 + " = " + list.get(7));
	}
}
