package com.coforge.day6;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		
		list.forEach(n -> System.out.println(n)); //for-each and lambda expression
		System.out.println("----");
		
		list.forEach(n -> {
			if(n%2 == 0)
				System.out.println(n);  // with condition.
		});
		System.out.println("----");
		
		list.forEach(System.out::println); //method reference.
		
		
	}

}
