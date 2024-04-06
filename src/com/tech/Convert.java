package com.tech;

public class Convert {
	
	public static void main(String[] args) {
		
	
	String s1 = new String("a"); // Create a new string object 's1' with the value "a"
    String s2 = s1.toUpperCase(); // Convert 's1' to uppercase and assign it to 's2'
    String s3 = s1.toLowerCase(); // Convert 's1' to lowercase and assign it to 's3'

	System.out.println(s1 == s2); // Print the result of the comparison whether 's1' is equal to 's2'
	System.out.println(s1 == s3); // Print the result of the comparison whether 's1' is equal to 's3'
	
}
}