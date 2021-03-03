package com.ups.test.executors;

public class Test {

	static String str;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		if (b1 & b2 | b3 & b1 | b2)
			System.out.println("ok");
		if (b1 & b2 | b3 & b2 | b3)
			System.out.println("ok ok");
		int[] a = { 1 };
		Test t = new Test();
		t.increment(a);
		System.out.println(a[a.length - 1]);
		
		try {
			
		}finally {
			
		}
	}

	public void increment(int i[]) {
		System.out.println(i[i.length - 1]++);
	}
}
