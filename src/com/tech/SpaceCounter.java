package com.tech;

public class SpaceCounter {
	
    public static void main(String[] args) {
        String str = "a R V I N D";
        int spaceCount = 0;

        // Iterate through the string and count spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Print the number of spaces
        System.out.println("Number of spaces: " + spaceCount);
    }
}
