package com.ups.test.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInserationOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arrayList = new ArrayList<>();
		arrayList.add("1Z");
		arrayList.add("4k");
		arrayList.add("2Y");
		arrayList.add("3X");
		System.out.println("ArrayList:::" + arrayList);

		List<String> linkedList = new LinkedList<>();
		linkedList.add("1Z");
		linkedList.add("4k");
		linkedList.add("2Y");
		linkedList.add("3X");
		System.out.println("LinkedList:::" + linkedList);
	}

}
