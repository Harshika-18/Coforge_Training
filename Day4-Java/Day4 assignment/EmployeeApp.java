package com.coforge.day4.assignment;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Harshika", 15000);
		employee.calculateAnnualSalary();

		System.out.println(employee);
	}

}
