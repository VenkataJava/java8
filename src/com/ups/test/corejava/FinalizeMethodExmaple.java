package com.ups.test.corejava;

public class FinalizeMethodExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeMethodExmaple f1 = new FinalizeMethodExmaple();
		FinalizeMethodExmaple f2 = new FinalizeMethodExmaple();
		f1 = null;
		f2 = null;
		System.gc();
	}

	public void finalize() {
		System.out.println("finalize called");
	}

}
