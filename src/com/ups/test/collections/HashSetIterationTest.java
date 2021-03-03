package com.ups.test.collections;

import java.util.HashSet;

public class HashSetIterationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		for (int i = 0; i < 10; i++) {
			set.add(i);
			set.remove(i = 1);
			System.out.println("size" + set.size());
		}

	}

}
