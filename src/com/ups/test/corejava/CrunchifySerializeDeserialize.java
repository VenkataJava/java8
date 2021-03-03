package com.ups.test.corejava;

import java.io.Serializable;

import com.ups.test.java8.Item;

public class CrunchifySerializeDeserialize implements Serializable {

	public static void main(String[] args) {
		int i;
		Item[] items = new Item[2];
		CrunchifySerializeDeserialize c = new CrunchifySerializeDeserialize();
		for (i = 0; i < items.length; i++) {
			//items[i] = (c) new Item();
		}

		items[0].setItemID("ITEM101");
		items[0].setDesc("iPad");
		items[0].setCost(499);
		items[0].setQuantity(1);

		items[1].setItemID("ITEM102");
		items[1].setDesc("iPhone");
		items[1].setCost(599);
		items[1].setQuantity(3);
	}
}