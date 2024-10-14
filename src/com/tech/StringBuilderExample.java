package com.tech;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a new StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append to the StringBuilder
        sb.append(" World");

        // Insert a string at a specific index
        sb.insert(5, ",");

        // Replace a portion of the string
        sb.replace(0, 5, "Hi");

        // Delete a portion of the string
        sb.delete(2, 4);

        // Reverse the string
        sb.reverse();

        // Convert to string and print the result
        String result = sb.toString();
        System.out.println(result);
    }
}
