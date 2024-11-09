package com.tech;

import java.util.*;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Initializing a Set with some elements
        Set<String> fruits = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));

        // Adding elements (duplicates are ignored)
        fruits.add("Mango");
        fruits.add("Apple");  // This will have no effect as "Apple" is already in the set

        // Removing an element
        fruits.remove("Banana");

        // Checking if an element exists
        System.out.println("Contains Orange? " + fruits.contains("Orange"));

        // Iterating through the set
        System.out.println("Fruits in the set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Converting Set to List (for sorting or other List operations)
        List<String> sortedFruits = new ArrayList<>(fruits);
        Collections.sort(sortedFruits);
        System.out.println("Sorted fruits: " + sortedFruits);
    }
}
