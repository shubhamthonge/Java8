package com.tech;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		// Supplier to generate a random number
		Supplier<Double> randomNumber = () -> Math.random();

		// Get values from the supplier
		System.out.println(randomNumber.get()); // Prints a random number
		System.out.println(randomNumber.get()); // Prints another random number
	}
}
