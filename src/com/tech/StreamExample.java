package com.tech;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers, square them, and print
        numbers.stream()
                .filter(n -> n % 2 == 0)    // Filter even numbers
                .map(n -> n * n)           // Square each number
                .forEach(System.out::println); // Print each squared number
    }
}
