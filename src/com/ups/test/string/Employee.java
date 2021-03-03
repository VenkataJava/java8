package com.ups.test.string;

public final class Employee {

	private final String firstName;
	private final String lastName;
	private final Adress adress;

	public Employee(String firstName, String lastName, Adress adress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Adress getAdress() throws CloneNotSupportedException {
		return (Adress) adress.clone();
	}

}