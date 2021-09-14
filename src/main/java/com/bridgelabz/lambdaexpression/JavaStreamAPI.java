package com.bridgelabz.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamAPI {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			myList.add(i);
		}

		myList.stream().forEach(n -> {
			System.out.println("Method1: Stream forEach value:" + n);
		});

		Function<Integer, Double> toDouble = Integer::doubleValue;
		List<Double> doubleList = myList.stream().map(toDouble).collect(Collectors.toList());
		System.out.println("Printing Double List: " + doubleList);
	}
}
