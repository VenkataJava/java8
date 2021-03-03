package com.ups.test.cloning;

public class Employee implements Cloneable {

	int id;
	String name;
	Department dept;

	public Employee(int id, String name, Department dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	// Overriding clone() method to create a deep copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		System.out.println("In clonemethod");
		Employee emp = (Employee) super.clone();
		emp.dept = (Department) dept.clone();
		return emp;
	}
}