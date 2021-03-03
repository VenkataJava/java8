package com.ups.test.java8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private int personId;
	private String name;
	private Date birthDate;
	private Gender gender;

	public Person(int personId, String name, Date birthDate, Gender gender) {
		super();
		this.personId = personId;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public boolean isMale() {
		return this.gender == Gender.MALE;
	}

	public boolean isFemale() {
		return this.gender == Gender.FEMALE;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

		StringBuilder str = null;
		str = new StringBuilder();
		str.append("Person Id:- " + getPersonId() + " Gender:- " + getGender() + " Name:- " + getName()
				+ " Birthdate:- " + dateFormat.format(getBirthDate()));
		return str.toString();
	}

	public static enum Gender {
		MALE, FEMALE
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + personId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (personId != other.personId)
			return false;
		return true;
	}*/

}