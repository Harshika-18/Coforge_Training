package com.coforge.day4.assignment;

public class Employee {
	private int employeeId;
	private String employeeName;
	private int salary;
	
	Employee(int employeeId, String employeeName, int salary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public void calculateAnnualSalary() {
		System.out.println("Annual Salary : " + salary*12);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	
	
}
