package com.ups.test.collections;

import java.util.Arrays;

public class ArrayListCustom<E> {

	// Define INITIAL_CAPACITY, size of elements of custom ArrayList
	private static final int INITIAL_CAPACITY = 10;
	private int size;
	private Object elementData[] = {};

	public ArrayListCustom() {
		elementData = new Object[INITIAL_CAPACITY];
	}

	/**
	 * add elements in custom/your own ArrayList Method adds elements in
	 * ArrayListCustom.
	 */
	public void add(E e) {
		if (size == elementData.length) {
			ensureCapacity();
		}
		elementData[size++] = e;
	}

	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		return (E) elementData[index];
	}

	/**
	 * Ensure capacity of custom/your own ArrayList.
	 *
	 * Method increases capacity of list by making it double.
	 */
	private void ensureCapacity() {
		int newIncresedCapacity = elementData.length * 2;
		elementData = Arrays.copyOf(elementData, newIncresedCapacity);
	}

	public void display() {
		System.out.println("Dispalying list");
		for (int i = 0; i < elementData.length; i++) {
			System.out.println(elementData[i] + " ");
		}
	}

	public Object remove(int index) {
		// if index is negative or greater than size of size, we throw
		// Exception.
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}

		Object removedElement = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--; // reduce size of ArrayListCustom after removal of element.

		return removedElement;
	}
}
