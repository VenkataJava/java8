package com.ups.test.cloning;

public class DeepCopyInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department dept1 = new Department("1", "A", "AVP");

		Employee emp1 = new Employee(111, "John", dept1);

		Employee emp2 = null;

		try {
			// Creating a clone of emp1 and assigning it to emp2
			emp2 = (Employee) emp1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Printing the designation of 'emp1'
		System.out.println(emp1.dept.designation); // Output : AVP
		// Changing the designation of 'emp2'
		emp2.dept.designation = "Director";
		emp2.dept.grade = "B";
		// This change will be reflected in original Employee 'emp1'
		System.out.println("emp1 object::--" + emp1.dept.designation); // Output : AVP
		System.out.println("emp1 object::--" + emp1.dept.grade); // Output : AVP
		System.out.println("emp2 object::--" + emp2.dept.designation); // Output : AVP
		System.out.println("emp2 object::-- " + emp2.dept.grade); // Output : AVP
	}

}
