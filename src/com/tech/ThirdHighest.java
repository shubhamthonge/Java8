package com.tech;

import java.util.Arrays;

public class ThirdHighest {
    public static void main(String[] args) {
        int[] numbers = {73, 49, 12, 54, 77, 51, 28, 42, 6, 10, 55, 89, 96};
        
        // Check if the array has at least three elements
        if (numbers.length < 3) {
            System.out.println("Array should have at least three elements.");
        } else {
            // Sort the array in descending order
            Arrays.sort(numbers);
            
            // Print the third highest number
            System.out.println("The third highest number is: " + numbers[numbers.length - 3]);
        }
    }
}
