package com.coforge.ems.ui;

import java.util.Scanner;

import com.coforge.ems.controller.EmployeeController;
import com.coforge.ems.model.Employee;

public class EmployeeApp {

	private static EmployeeController controller = new EmployeeController();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String confirmation = "", result = "";
		do {
			System.out.println("1.Create 2.Update 3.Delete 4.Find 5.FindAll 6. Quit");
			System.out.println("Enter your choice : ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter employee id, name, salary and department number.");
				Employee employee = new Employee(scanner.nextInt(), scanner.next(), scanner.nextInt(),
						scanner.nextInt());
				result = controller.createEmployee(employee);
				System.out.println(result);
				break;

			case 2:
				System.out.println("Enter employee id, updated name, updated salary and updated department number. ");
				Employee employee2 = new Employee(scanner.nextInt(), scanner.next(), scanner.nextInt(),
						scanner.nextInt());
				result = controller.updateEmployee(employee2);
				System.out.println(result);
				break;

			case 3:
				System.out.println("Enter employee id to be deleted.");
				result = controller.deleteEmployee(scanner.nextInt());
				System.out.println(result);
				break;

			case 4:
				System.out.println("Enter employee id to find : ");
				result = controller.findEmployee(scanner.nextInt());
				System.out.println(result);
				break;

			case 5:
				System.out.println(controller.findAllEmployee());
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice.");
				break;

			}
			System.out.println("Do you want to continue [Yes | No]");
			confirmation = scanner.next();

		} while (confirmation.equalsIgnoreCase("Yes"));

		scanner.close();
	}
}
