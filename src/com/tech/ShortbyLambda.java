package com.tech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortbyLambda {

	public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Amanda");
        names.add("Zoe");
        names.add("Catherine");

        // Sort the list using a lambda expression
        Collections.sort(names, (s1, s2) -> s1.length() - s2.length()); //compare two string

        System.out.println("Sorted by length:");
        names.forEach(System.out::println); //forEach() with Method Reference
    }
}
