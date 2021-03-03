package com.ups.test.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("101", "jhon", 25, 100.00, 11));
		employeeList.add(new Employee("105", "jhon1", 35, 700.00, 77));
		employeeList.add(new Employee("107", "jhon3", 65, 6000.00, 66));
		employeeList.add(new Employee("104", "jhon4", 55, 150.00, 33));
		employeeList.add(new Employee("109", "jhon7", 33, 2500.00, 44));
		employeeList.add(new Employee("103", "jhon8", 20, 350.00, 69));
		employeeList.add(new Employee("108", "jhon3", 40, 200.00, 22));
		employeeList.add(new Employee("106", "jhon9", 70, 100.00, 22));
		employeeList.add(new Employee("102", "jhon", 37, 160.00, 22));

		System.out.println("-----------Get list of employees whose age is >45------");
		List<String> empNames = employeeList.stream().filter(e -> e.getAge() > 45).map(Employee::geteName)
				.collect(Collectors.toList());
		empNames.forEach(System.out::println);

		System.out.println("-----------Get list of employees whose age is >45------");
		List<Employee> employess = employeeList.stream().filter(e -> e.getAge() > 45).collect(Collectors.toList());
		employess.forEach(System.out::println);

		System.out.println("------ What is the average salary of all employess------");
		Double avgSal = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSaraly));
		System.out.println(avgSal);

		System.out.println("-----Get All dept Ids from Employess without duplicate----");
		List<Integer> deptIds = employeeList.stream().map(Employee::getDeptId).distinct().collect(Collectors.toList());
		deptIds.forEach(System.out::println);

		System.out.println("-----group Employess based on deptId----");
		Map<Integer, List<Employee>> groupEmployeesBasedonDeptId = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId));
		System.out.println(groupEmployeesBasedonDeptId);

		System.out.println("----sort based on employee salary-----");
		List<Employee> employSalList = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSaraly))
				.collect(Collectors.toList());
		employSalList.forEach(System.out::println);
		System.out.println("--------secondHightSalay-------");
		List<Employee> secondHightSalay = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSaraly).reversed()).limit(2)
				.collect(Collectors.toList());
		secondHightSalay.forEach(System.out::println);
		System.out.println("----------------");
		Employee maxEmp = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println(maxEmp);

		System.out.println("----------------");
		Employee minEmp = employeeList.stream().min(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println(minEmp);

		Optional<Employee> secondHightSalaryEmployee = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSaraly).reversed()).skip(1).findFirst();
		System.out.println("secondHightSalaryEmployee::--" + secondHightSalaryEmployee.get());

		List<Employee> listEmp = employeeList.stream()
				.sorted(Comparator.comparing(Employee::getEmpId).thenComparingInt(Employee::getAge))
				.collect(Collectors.toList());
		System.out.println(listEmp);

		System.out.println("Convert list to map");
		Map<String, String> empIdKeyNameValueinMap = employeeList.stream()
				.collect(Collectors.toMap(Employee::getEmpId, Employee::geteName));
		System.out.println(empIdKeyNameValueinMap);
		System.out.println("--------------Employees age between 50 & 70 -------------------");
		List<Employee> ageBetweenList = employeeList.stream().filter(e -> e.getAge() > 50 && e.getAge() <= 70)
				.collect(Collectors.toList());
		ageBetweenList.forEach(System.out::println);

		System.out.println("-----------------max salary Employee----------------------------");
		Optional<Employee> maxSalaryEmployee = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSaraly)));

		System.out.println(maxSalaryEmployee);
	}
}