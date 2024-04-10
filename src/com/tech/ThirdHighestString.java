package com.tech;
import java.util.Arrays;
import java.util.List;

public class ThirdHighestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        String thirdHighest = words.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                .skip(2) // Skip the first two (third highest remains)
                .findFirst()
                .orElse(null);

        if (thirdHighest != null) {
            System.out.println("Third Highest String: " + thirdHighest);
        } else {
            System.out.println("The list does not have at least three distinct strings.");
        }
    }
}
