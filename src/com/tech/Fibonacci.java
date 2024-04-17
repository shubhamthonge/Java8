package com.tech;

public class Fibonacci {

	public static void main(String[] args) {
		int limit = 10; // Change this to set the limit for Fibonacci numbers
		int previous = 0;
		int current = 1;

		System.out.println("Fibonacci Series up to " + limit + ":");
		System.out.print(previous + " ");


		while (current <= limit) {
			System.out.print(current + " ");
			int next = previous + current;
			previous = current;
			current = next;
		}
	}
}
