package com.ups.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.setId(11);
		e1.setName("aa");
		
		Employee e2 = new Employee();
		e1.setId(22);
		//e1.setName(1,b");
		
		List<Integer> list = new ArrayList<Number>();
		list.add(e2);
		list.add(e1);
		list.add(Long.valueOf(10));
		List list1 = list;
		System.out.println(list1.size());
		//Collections.sort(list);

		Integer i = Integer.valueOf("1");
		if(i.toString() == "1") 
			System.out.println("equal");
		else 
			System.out.println("Not equal");
		
		
	}

}
