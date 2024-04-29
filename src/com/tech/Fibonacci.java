package com.tech;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        int limit = 10; // Set the limit of Fibonacci numbers

        System.out.print("Fibonacci Series up to " + limit + " terms: ");
        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(limit)
                .forEach(fib -> System.out.print(fib[0] + " "));
    }
}
