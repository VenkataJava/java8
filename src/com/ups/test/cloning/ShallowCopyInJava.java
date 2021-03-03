package com.ups.test.cloning;

public class ShallowCopyInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course science = new Course("Physics", "Chemistry", "Biology");

		Student student1 = new Student(111, "John", science);
		Student student2 = null;

		try {

			student2 = (Student) student1.clone();

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(student1.course.subject3);
		student1.course.subject3 = "Maths";
		// This change will be reflected in original student 'student1'
		System.out.println(student1.course.subject3);

	}

}
