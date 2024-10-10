package com.tech;

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		// Using lambda expression to implement the functional interface
		MyFunctionalInterface messagePrinter = (message) -> System.out.println("Message: " + message);

		// Calling the method
		messagePrinter.displayMessage("Hello, this is a functional interface example!");
	}
}