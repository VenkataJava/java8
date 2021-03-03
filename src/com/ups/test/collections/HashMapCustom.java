package com.ups.test.collections;

import java.util.Map.Entry;

public class HashMapCustom<K, V> {

	private Entry<K, V>[] table; // Array of Entry
	private int capacity = 4;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public HashMapCustom() {
		table = new Entry[capacity];
	}

}
