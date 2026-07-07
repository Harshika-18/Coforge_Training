package com.coforge.day6;

@FunctionalInterface
interface MyReference {
	void showMessage();
}

public class MethodReferenceTest {

	void myInstanceMethod() {
		System.out.println("Example for Instance Method Reference");
	}
	
	static void myStaticMethod() {
		System.out.println("Example for Static Method Reference");
	}
	MethodReferenceTest(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		//reference for instance method.
		MethodReferenceTest obj = new MethodReferenceTest();
		MyReference reference = obj::myInstanceMethod;
		reference.showMessage();
		
		//reference for static method.
		reference = MethodReferenceTest::myStaticMethod;
		reference.showMessage();
		
		//reference for constructor.
		reference = MethodReferenceTest::new;
		reference.showMessage();
	}

}
