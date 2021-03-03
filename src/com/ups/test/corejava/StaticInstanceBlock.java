package com.ups.test.corejava;

public class StaticInstanceBlock {

	public StaticInstanceBlock() {
		System.out.println("In constructor444444444444");
	}

	static {
		System.out.println("in Static block1111111");
	}
	
	{
		System.out.println("in Instance block333333333");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main Method22222222222");
		StaticInstanceBlock sib = new StaticInstanceBlock();
	}

}
