package com.coforge.day6;

interface MyInterface {
	public void myMethod1();

	public default void myMethod2() {
		System.out.println("Default Method.");
	};

	public static void myMethod3() {
		System.out.println("Static Method.");
	};
}

public class JavaEightInterfaceTest implements MyInterface {

	public static void main(String[] args) {

	}

	@Override
	public void myMethod1() {
		System.out.println("Abstract Method.");
	}

	@Override
	public void myMethod2() {
		System.out.println("Default Method.");
	};

//	@Override
//	public void myMethod3() {
//		System.out.println("Static Method.");       //static methods cannot be overridden.
//	}; 

}
