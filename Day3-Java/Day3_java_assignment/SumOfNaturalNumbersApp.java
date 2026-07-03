package com.coforge.day3;

import java.util.Scanner;

public class SumOfNaturalNumbersApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int result = 0;
		for (int i = 1; i <= n; i++) {
			result = result + i;
		}

		System.out.println("Sum of Natural Numbers from 1 to " + n + " is : " + result);

		sc.close();
	}

}
