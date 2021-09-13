package com.bridgelabz.lambdaexpression;

@FunctionalInterface
interface IMathFunction {
	int calculate(int a, int b);
	static void printResult(int a, int b, String function, IMathFunction fobj) {
		System.out.println("Result of "+function+" is "+fobj.calculate(a, b));
	}
}

public class LambdaFunction {
	
	public static void main(String[] args) {

		IMathFunction add = (x, y) -> x + y;
		IMathFunction subtract = (x, y) -> x - y;
		IMathFunction divide = (x, y) -> x / y;

		System.out.println("Addition is " + add.calculate(6, 3));
		System.out.println("Subtraction is " + subtract.calculate(6, 3));
		System.out.println("Division is " + divide.calculate(6, 3));

		IMathFunction.printResult(6, 3, "Addition", add);
		IMathFunction.printResult(6, 3, "Subtraction", subtract);
		IMathFunction.printResult(6, 3, "Division", divide);
	}
}
