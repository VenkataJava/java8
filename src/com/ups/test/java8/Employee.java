package com.ups.test.java8;

public class Employee {

	private String empId;
	private String eName;
	private int age;
	private double saraly;
	private int deptId;

	public Employee(String empId, String eName, int age, double saraly, int deptId) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.age = age;
		this.saraly = saraly;
		this.deptId = deptId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSaraly() {
		return saraly;
	}

	public void setSaraly(double saraly) {
		this.saraly = saraly;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", age=" + age + ", saraly=" + saraly + ", deptId="
				+ deptId + "]";
	}

}
