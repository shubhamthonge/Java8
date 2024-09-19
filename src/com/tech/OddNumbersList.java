package com.tech;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersList {
    public static void main(String[] args) {
        List<Integer> oddNumbers = new ArrayList<>();

        // Loop to get odd numbers from 100 to 1
        for (int i = 99; i >= 1; i -= 2) {
            oddNumbers.add(i);
        }

        // Print the list of odd numbers
        System.out.println("Odd numbers from 100 to 1: " + oddNumbers);
    }
}
