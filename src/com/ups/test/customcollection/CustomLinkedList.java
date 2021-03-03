package com.ups.test.customcollection;

public class CustomLinkedList {

	private Node head;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	public void insertAt(int index, int data) {
		Node nodeToBeInserted = new Node(data);
		Node node = head;
		for (int i = 0; i < index - 1; i++) {
			node = node.next;
		}
		node.next = nodeToBeInserted;
	}

	public void reverse() {
		Node pointer = head;
		Node previous = null, current = null;
		while (pointer != null) {
			current = pointer;
			pointer = pointer.next;
			
			//reverse the link=
			current.next = previous;
			previous = current;
			head = current;
		}
	}

	public void display() {
		if (head != null) {
			Node currentNode = head;
			while (currentNode.next != null) {
				System.out.println(currentNode);
				currentNode = currentNode.next;
			}
			System.out.println(currentNode.data);
		}
	}
}
