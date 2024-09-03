package com.tech;

public class M {
	    public static void main(String[] args) {
	        int N = 5; // Central row length

	        // Generate the pattern
	        for (int i = 1; i <= 2 * N - 1; i++) {
	            int num = i <= N ? i : 2 * N - i;
	            int spaces = N - num;

	            // Print leading spaces
	            System.out.print(" ".repeat(spaces));

	            // Print increasing sequence
	            for (int j = 1; j <= num; j++) System.out.print(j + " ");

	            // Print decreasing sequence
	            for (int j = num - 1; j >= 1; j--) System.out.print(j + " ");

	            System.out.println(); // New line
	        }
	    }
	}


