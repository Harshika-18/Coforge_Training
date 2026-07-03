package com.coforge.day3;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee harshika = new Employee(101, "Harshika", 15000);
		harshika.display();
		Employee neha = new Employee(102, "Neha", 15000);
		neha.display();
		
		Employee satvika = new Employee(103, "Satvika", 15000);
		satvika.display();
		
		harshika.setSalary(20000);
		harshika.display();
		
		System.out.println(harshika.getSalary());

	}

}
