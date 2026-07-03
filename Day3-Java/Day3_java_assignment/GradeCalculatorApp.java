package com.coforge.day3;

import java.util.Scanner;

public class GradeCalculatorApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the grade : ");
		int grade = sc.nextInt();
		
		if(grade>=90) {
			System.out.println("Grade A");
		}
		else if(grade>=80) {
			System.out.println("Grade B");
		}
		else if(grade>=70) {
			System.out.println("Grade C");
		}
		else if(grade>=60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade F");
		}
		
		sc.close();
	}

}
