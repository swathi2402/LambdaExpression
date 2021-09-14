package com.bridgelabz.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreamAPI {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			myList.add(i);
		}

		Function<Integer, Double> toDouble = Integer::doubleValue;
		Predicate<Integer> isEvenFunction = n -> n > 0 && n % 2 == 0;
		
		myList.stream().forEach(n -> {
			System.out.println("Method1: Stream forEach value:" + n);
		});

		List<Double> doubleList = myList.stream()
									.map(toDouble)
									.collect(Collectors.toList());
		System.out.println("Printing Double List: " + doubleList);
		
		List<Integer> evenList = myList.stream()
								.filter(isEvenFunction)
								.collect(Collectors.toList());
		System.out.println("Printing Even List: " + evenList);
		
		Integer firstEven = myList.stream()
								.filter(isEvenFunction)
								.peek(n -> System.out.println("Peek Even Number: " + n))
								.findFirst()
								.orElse(null);
		System.out.println("First Even Number: " + firstEven);
	}
}
