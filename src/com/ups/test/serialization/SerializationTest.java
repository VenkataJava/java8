package com.ups.test.serialization;

import java.io.IOException;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String fileName = "employee.ser";
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Pankaj");
		emp.setSalary(5000);

		SerializationUtil.serialize(emp, fileName);

		Employee empNew = (Employee) SerializationUtil.deserialize(fileName);

		System.out.println(emp);
		System.out.println(empNew);

	}

}