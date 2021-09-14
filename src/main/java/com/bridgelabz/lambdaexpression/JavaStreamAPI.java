package com.bridgelabz.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamAPI {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			myList.add(i);
		}
		
		myList.stream().forEach(n -> {
			System.out.println("Method1: Stream forEach value:" + n);
		});
	}
}
