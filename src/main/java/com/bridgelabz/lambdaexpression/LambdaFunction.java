package com.bridgelabz.lambdaexpression;

@FunctionalInterface
interface IMathFunction {
	int calculate(int x, int y);
}

public class LambdaFunction {
	
	public static void main(String[] args) {

		IMathFunction add = (x, y) -> x + y;
		IMathFunction subtract = (x, y) -> x - y;
		IMathFunction divide = (x, y) -> x / y;

		System.out.println("Addition is " + add.calculate(6, 3));
		System.out.println("Subtraction is " + subtract.calculate(6, 3));
		System.out.println("Division is " + divide.calculate(6, 3));

	}
}
