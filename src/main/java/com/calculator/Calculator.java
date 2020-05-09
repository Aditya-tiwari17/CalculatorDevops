package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args){
		double num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");

		num1 = scanner.nextDouble();
		System.out.print("Enter second number:");
		num2 = scanner.nextDouble();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);
		scanner.close();
		double output;

		switch (operator)
		{
			case '+':
				output = add(num1,num2);
				break;

			case '-':
				output = subtract(num1,num2);
				break;

			case '*':
				output = multiply(num1,num2);
				break;

			case '/':
				output =  divide(num1,num2);
				break;

			default:
				System.out.printf("You have entered wrong operator");
				return;
		}
		System.out.println(num1+" "+operator+" "+num2+": "+output);

	}

	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double subtract(double a, double b) {
		return a - b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		double result;
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Double.valueOf(a)/Double.valueOf(b);
		}
		return result;
	}
}