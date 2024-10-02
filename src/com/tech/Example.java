package com.tech;
import java.util.Arrays;

public class Example {
    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Arrays.asList("Hello", "World").forEach(Example::print);
    }
}
