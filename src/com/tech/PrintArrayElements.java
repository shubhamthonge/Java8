package com.tech;

public class PrintArrayElements {

	public static void main(String[] args) {
		// Initialize the array with predefined elements
		int[] array = { 10, 20, 30, 40, 50 };

		// Print all elements of the array safely
		System.out.println("The elements of the array are:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
