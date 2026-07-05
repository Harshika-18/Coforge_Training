package com.coforge.day4.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("Before Exception.");
		
		//int a = 10/0; //java.lang.ArithmeticException: / by zero
		
		//int a = Integer.parseInt("abc"); //java.lang.NumberFormatException
		
		//int[] arr = {10,20,30};
		//System.out.println(arr[3]); //java.lang.ArrayIndexOutOfBoundsException
		
		//int[] arr = new int[-5]; //java.lang.NegativeArraySizeException
		
		//String s = null;
		//System.out.println(s.length()); //java.lang.NullPointerException
		
		System.out.println("After Exception.");
	}

}
