package com.tech;

public class E {

	public static void main(String[] args) {
		int counter = 1; // Initialize the counter to start from 1
		int rows = 7; // Number of rows

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(counter + " ");
				counter++; // Increment the counter after printing each number
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}
