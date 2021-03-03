package com.ups.test.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = new ArrayList<>();
		students.add(new Student(33, "venkata"));
		students.add(new Student(30, "lasya"));
		students.add(new Student(23, "lucky"));
		students.add(new Student(22, "chinnu"));
		students.add(new Student(12, "vasu"));
		students.add(new Student(11, "naga"));

		students.forEach(System.out::println);
		System.out.println("-----sort By studentId----------");
		List<Student> studList = students.stream().sorted(Comparator.comparingInt(Student::getStudentId))
				.collect(Collectors.toList());
		studList.forEach(System.out::println);
		System.out.println("-----sort By StudentName----------");
		List<Student> stList = students.stream().sorted(Comparator.comparing(Student::getStudentName))
				.collect(Collectors.toList());
		stList.forEach(System.out::println);
	}

}
