package com.ups.test.cloning;

public class Department implements Cloneable {

	String empId;

	String grade;

	String designation;

	public Department(String empId, String grade, String designation) {
		this.empId = empId;

		this.grade = grade;

		this.designation = designation;
	}

	// Default version of clone() method.
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
