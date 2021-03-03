package com.ups.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		System.out.println(Collections.binarySearch(list, 4));

	}

}
