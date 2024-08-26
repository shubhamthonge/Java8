package com.tech;
import java.util.Arrays;

public class ArrayEqualit {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}, b = {5, 4, 3, 2,7, 1};
        System.out.println(Arrays.equals(Arrays.stream(a).sorted().toArray(), Arrays.stream(b).
        		sorted().toArray()));
    }
}
