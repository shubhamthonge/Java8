package com.tech;

public class Test3 {

	public static String revString(String input) {

		String in = input;

		String output = "";

		for (int count = in.length() - 1; count >= 0; count--) {
			output = output + in.charAt(count);

		}
		return output;

	}

	public static void main(String[] args) {

		String input = "India is great";

		String output = revString(input);
		
		System.out.println(input);
		System.out.println(output);


	}
}