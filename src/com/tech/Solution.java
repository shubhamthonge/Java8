package com.tech;
import java.util.*;

public class Solution {
    public static String checkPangrams(List<String> pangrams) {
        StringBuilder result = new StringBuilder();
        for (String s : pangrams) {
            Set<Character> letters = new HashSet<>();
            for (char c : s.toLowerCase().toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    letters.add(c);
                }
            }
            result.append(letters.size() == 26 ? "1" : "0");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        List<String> pangrams = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pangrams.add(sc.nextLine());
        }
        
        System.out.println(checkPangrams(pangrams));
    }
}
