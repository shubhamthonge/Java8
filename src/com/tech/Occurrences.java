package com.tech;

import java.util.HashMap;

public class Occurrences {

	public static void main(String[] args) {
		
		 String a = "india is my country india is";
	        
	        // Split the string into words
	        String[] words = a.split("\\s+");
	        
	        // Create a HashMap to store word occurrences
	        HashMap<String, Integer> wordCounts = new HashMap<>();
	        
	        // Count occurrences of each word
	        for (String word : words) {
	            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
	        }
	        
	        // Print the result
	        System.out.println("Word occurrences:");
	        for (String word : wordCounts.keySet()) {
	            System.out.println("'" + word + "': " + wordCounts.get(word) + " times");
	        }
	    }
}
