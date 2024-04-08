package com.tech;

import java.util.Arrays;
import java.util.List;

public class ThirdHighestSimple {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 8, 15, 30, 25);

        Integer thirdHighest = numbers.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(2) // Skip the first two (third highest remains)
                .findFirst()
                .orElse(null);

        if (thirdHighest != null) {
            System.out.println("Third Highest Element: " + thirdHighest);
        } else {
            System.out.println("The list does not have at least three distinct elements.");
        }
    }
}