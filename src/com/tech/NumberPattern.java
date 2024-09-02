package com.tech;

public class NumberPattern {
    public static void main(String[] args) {
        int counter = 1; // Initialize the counter
        int rows = 3;    // Number of rows
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++; // Increment the counter
            }
            System.out.println(); // Move to the next line
        }
    }
}
