package com.ups.test.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInserationOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<>();
		hashSet.add("1Z");
		hashSet.add("4k");
		hashSet.add("2Y");
		hashSet.add("3X");
		hashSet.add(null);
		System.out.println("HashSet::::" + hashSet);

		Set<String> linkedhashSet = new LinkedHashSet();
		linkedhashSet.add("1Z");
		linkedhashSet.add("4k");
		linkedhashSet.add("2Y");
		linkedhashSet.add("3X");
		linkedhashSet.add(null);
		System.out.println("linkedhashSet::::" + linkedhashSet);

		Set<String> treeSet = new TreeSet<>();
		treeSet.add("1Z");
		treeSet.add("4k");
		treeSet.add("2Y");
		treeSet.add("3X");
		// TreeSet doesn’t allow even a single null element. If you try to insert null
		// element into TreeSet, it throws NullPointerException
		// treeSet.add(null);
		System.out.println("TreeSet::::" + treeSet);
	}

}