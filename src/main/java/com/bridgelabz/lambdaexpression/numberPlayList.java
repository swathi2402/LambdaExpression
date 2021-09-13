package com.bridgelabz.lambdaexpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class numberPlayList {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			myList.add(i);
		}

		Iterator<Integer> iterator = myList.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.println("Method1: Iterator value:" + i);
		}

		class MyConsumer implements Consumer<Integer> {
			public void accept(Integer t) {
				System.out.println("Method2: Comsumer impl value:" + t);
			}
		}
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("Method3: forEach Anonymouse class value:" + t);
			}
		});

		Consumer<Integer> myListAction = n -> {
			System.out.println("Method4: forEach Lambda impl value:" + n);
		};
		myList.forEach(myListAction);

		myList.forEach(n -> {
			System.out.println("Method5: forEach Lambda impl value:" + n);
		});

		Function<Integer, Double> toDouble = Integer::doubleValue;
		myList.forEach(n -> {
			System.out.println("Method6: forEach lambda double value:" + toDouble.apply(n));
		});

		Predicate<Integer> isEvenFunction = n -> n > 0 && n % 2 == 0;
		myList.forEach(n -> {
			System.out.println("Method7: forEach value of: " + n + " check for even: " + isEvenFunction.test(n));
		});
	}
}
