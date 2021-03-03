package com.ups.test.customcollection;

public class CustomLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomLinkedList customLinkedList = new CustomLinkedList();
		customLinkedList.insert(5);
		customLinkedList.insert(10);
		customLinkedList.insert(15);
		customLinkedList.insert(20);
		customLinkedList.display();
		customLinkedList.insertAt(2, 100);
		System.out.println("********");
		customLinkedList.display();
		customLinkedList.reverse();
	}

}
