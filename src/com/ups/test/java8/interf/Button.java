package com.ups.test.java8.interf;

public class Button implements Clickable, Accessible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button button = new Button();
		button.click();
		button.access();
		button.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Accessible.super.print();
		Clickable.super.print();
	}

}
