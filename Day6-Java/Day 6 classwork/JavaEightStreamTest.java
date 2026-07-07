package com.coforge.day6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaEightStreamTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 12, 13, 14, 15);
		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		long count = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println(count);

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(System.out::println);

		// stream is an initial operation
		// filter is intermediate operation
		// collection is termination operation.

		List<String> fruits = Arrays.asList( "apple", "blueberry", "apricot", "banana" );
		fruits.stream().filter(n -> n.contains("a")).forEach(System.out::println);
		fruits.stream().filter(n -> n.contains("a")).map(n -> n.length()).forEach(System.out::println);
		
		Map<Integer, String> map = fruits.stream().collect(Collectors.toMap(x -> x.length(), x -> x)); //throws error for same key (unlike in regular maps) because it is parallel processing.
		System.out.println(map);
		
		Date date = new Date();
		System.out.println(date);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

	}

}
