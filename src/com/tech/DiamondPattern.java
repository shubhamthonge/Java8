package com.tech;

public class DiamondPattern {
	public static void main(String[] args) {
		int N = 4; // Number of rows in the top half

		// First part of the pattern (Top half)
		for (int i = 1; i <= N; i++) {
			// Print increasing numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// Print decreasing numbers
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Second part of the pattern (Bottom half)
		for (int i = 2; i <= N; i++) {
			// Print leading spaces for alignment
			System.out.print("  ".repeat(N - i));

			// Print increasing numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			// Print decreasing numbers
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
