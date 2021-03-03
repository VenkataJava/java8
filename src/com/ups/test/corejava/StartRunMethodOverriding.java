package com.ups.test.corejava;

public class StartRunMethodOverriding extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartRunMethodOverriding t = new StartRunMethodOverriding();
		t.start();
		t.start();
		t.run();
		t.run();
	}

	public void start() {
		System.out.println("In start Method");
	}

	public void run() {
		System.out.println("In run Method");
	}

}