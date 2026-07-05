package com.coforge.day4.assignment;

public class Student {

	private int id;
	private String name;
	private int marks;
	
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public void displayStudentDetails() {
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Marks : " + marks);
	}
	public void calculateGrade() {
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=80) {
			System.out.println("Grade B");
		}
		else if(marks>=70) {
			System.out.println("Grade C");
		}
		else if(marks>=60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade F");
		}
	}
	
}
