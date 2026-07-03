package com.coforge.day3;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int n = sc.nextInt();

		int num = 0;
		while (n > 0) {
			num = num * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("Reverse of " + n + " is " + num);
		sc.close();

	}

}
