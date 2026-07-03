package com.coforge.day3;

import java.util.Scanner;

public class PrimeNumberCheckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");

		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println(n + " is neither a prime not composite");
		} else {
			boolean flag = false;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = true;
					break;
				}
			}
			if (flag == true) {
				System.out.println(n + " is not a Prime Number.");
			} else {
				System.out.println(n + " is a Prime Number.");
			}
		}

		sc.close();

	}

}
