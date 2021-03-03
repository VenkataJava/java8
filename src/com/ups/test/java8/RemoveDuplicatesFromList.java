package com.ups.test.java8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.ups.test.java8.Person.Gender;

public class RemoveDuplicatesFromList {

	private static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(1, "Yashwant", dateFormat.parse("11/02/1982"), Gender.MALE));
		persons.add(new Person(2, "Mahesh", dateFormat.parse("01/08/1981"), Gender.MALE));
		persons.add(new Person(3, "Vinay", dateFormat.parse("01/08/1981"), Gender.MALE));
		persons.add(new Person(4, "Dinesh", dateFormat.parse("01/08/1981"), Gender.MALE));
		persons.add(new Person(5, "Kapil", dateFormat.parse("01/02/1989"), Gender.MALE));
		persons.add(new Person(6, "Ganesh", dateFormat.parse("11/02/1982"), Gender.MALE));
		persons.add(new Person(7, "Nita", dateFormat.parse("01/08/1981"), Gender.FEMALE));
		persons.add(new Person(8, "Pallavi", dateFormat.parse("04/25/1987"), Gender.FEMALE));
		persons.add(new Person(9, "Mayuri", dateFormat.parse("01/08/1981"), Gender.FEMALE));
		persons.add(new Person(10, "Divya", dateFormat.parse("01/08/1981"), Gender.FEMALE));
		persons.add(new Person(10, "Divya", dateFormat.parse("01/08/1981"), Gender.FEMALE));

		System.out.println("-----group students by birthDate-----");
		Map<Date, List<Person>> personMap = persons.stream().collect(Collectors.groupingBy(Person::getBirthDate));
		System.out.println(personMap);

		System.out.println(
				"-----remove duplicates by distinct() and mandatory to override equals & hashCode() in person object-----");
		List<Person> wihtoutDuplicates = persons.stream().distinct().collect(Collectors.toList());
		System.out.println("size of the List::--- " + wihtoutDuplicates.size());

		System.out.println("-----remove duplicates by personId--------");
		Set<Person> setDuplicates = persons.stream()
				.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Person::getPersonId))));
		System.out.println("size of the set:::----" + setDuplicates.size());
	}

}
