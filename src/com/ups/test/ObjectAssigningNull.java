package com.ups.test;

public class ObjectAssigningNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Foo f = new Foo();
		System.out.println(f.hashCode());
		f = new Foo();
		System.out.println(f.hashCode());
		f = null;
		f = new Foo();
		System.out.println(f.hashCode());

	}

	public void finalize() {
		System.out.println("In finalize method");
	}
}

class Foo {

}
