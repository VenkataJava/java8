package com.ups.test.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapInserationOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("aaa", 108);
		hashMap.put(null, 109);
		hashMap.put(null, null);
		System.out.println("hashMap:::" + hashMap);

		Map<String, Integer> linkedHashMap = new LinkedHashMap();
		linkedHashMap.put("aaa", 108);
		linkedHashMap.put(null, 109);
		linkedHashMap.put(null, null);
		System.out.println("linkedHashMap:::" + linkedHashMap);

		SortedMap<String, Integer> treeSortedMap = new TreeMap<String, Integer>();
		treeSortedMap.put("aaa", 108);
		treeSortedMap.put(null, 109);
		treeSortedMap.put(null, null);
		System.out.println("treeSortedMap:::" + treeSortedMap);

		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("aaa", 108);
		treeMap.put(null, 109);
		treeMap.put(null, null);
		System.out.println("linkedHashMap:::" + linkedHashMap);

		Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<String, Integer>();
		concurrentHashMap.put("aaa", 108);
		concurrentHashMap.put(null, 109);
		concurrentHashMap.put(null, null);
		System.out.println("concurrentHashMap:::" + concurrentHashMap);

	}

}
