package com.tech;

import java.util.Arrays;

public class mm {
    public void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        mm obj = new mm();
        Arrays.asList("Hello", "World").forEach(obj::print);
    }
}
