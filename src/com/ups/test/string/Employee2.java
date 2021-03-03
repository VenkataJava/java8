package com.ups.test.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Employee2 {

	private final String firstName;
	private final String lastName;
	private final List<Adress2> adressList;

	public Employee2(String firstName, String lastName, List<Adress2> adressList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.adressList = adressList;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public ArrayList<Adress2> getAdress() throws CloneNotSupportedException {
		return (ArrayList<Adress2>) Collections.unmodifiableCollection(adressList);
		//return (ArrayList<Adress2>)adressList;
	}

}