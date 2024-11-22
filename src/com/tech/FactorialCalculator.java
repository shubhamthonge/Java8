package com.tech;

import java.util.Scanner;

public class FactorialCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user for input
		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();

		if (number < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
		} else {
			System.out.println("Factorial of " + number + " is " + calculateFactorial(number));
		}

		scanner.close();
	}

	public static long calculateFactorial(int n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
