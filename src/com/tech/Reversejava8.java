package com.tech;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reversejava8 {

	public static void main(String[] args) {
		// Input string
		String input = "i love india I LOVE INDIA";

		// Reverse each word in the string
		String result = Arrays.stream(input.split(" ")) // Split the input string into words
				.map(word -> new StringBuilder(word).reverse().toString()) // Reverse each word
				.collect(Collectors.joining(" ")); // Join the reversed words with a space

		// Print the result
		System.out.println(result);
	}
}
