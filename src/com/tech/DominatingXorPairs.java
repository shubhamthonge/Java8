package com.tech;
import java.util.*;

public class DominatingXorPairs {

    static int dominatingXorPairs(List<Integer> arr) {
        int N = arr.size();
        int ans = 0;
        int[] bits = new int[32];

        // Iterate over the list
        for (int i = 0; i < N; ++i) {
            // Find the most significant bit
            int val = (int)(Math.log(arr.get(i)) / Math.log(2));
            ans += bits[val];
            bits[val]++;
        }

        return N * (N - 1) / 2 - ans;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> arr = Arrays.asList(4, 3, 5, 2);
        int result = dominatingXorPairs(arr);

        System.out.println("Number of dominating XOR pairs: " + result);
    }
}
