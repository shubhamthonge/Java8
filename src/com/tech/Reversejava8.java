package com.tech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reversejava8 {

	public static void main(String[] args) {
		String input = "i love india I LOVE INDIA";

		// Split the input string into words
		List<String> words = Arrays.asList(input.split(" "));

		// Reverse the order of the words
		Collections.reverse(words);

		// Change the case of each word
		List<String> transformedWords = words.stream().map(Reversejava8::toggleCase).collect(Collectors.toList());

		// Join the words back into a single string
		String result = String.join(" ", transformedWords);

		// Print the result
		System.out.println(result);
	}

	// Helper method to toggle the case of a word
	private static String toggleCase(String word) {
		return word.chars().mapToObj(
				c -> Character.isUpperCase(c) ? Character.toLowerCase((char) c) : Character.toUpperCase((char) c))
				.map(String::valueOf).collect(Collectors.joining());
	}
}
