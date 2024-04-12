package com.tech;

public class Test2 {

	public static String revString(String input) {

		String in = input;

		String output = "";

		for (int count = in.length() - 1; count >= 0; count--) {
			output = output + in.charAt(count);

		}
		return output;

	}
	
	public static String getStringInParentheses(String input) {
        int openParenthesesIndex = -1;
        int closeParenthesesIndex = -1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                openParenthesesIndex = i;
            } else if (input.charAt(i) == ')' && openParenthesesIndex != -1) {
                closeParenthesesIndex = i;
                break;
            }
        }

        if (openParenthesesIndex != -1 && closeParenthesesIndex != -1) {
            return input.substring(openParenthesesIndex + 1, closeParenthesesIndex);
        } else {
            return null;
        }
    }

	public static void main(String[] args) {

		String input = "xyzqwsqd(edcbayzye(pqrs))";
		
		
		
		
		System.out.println(getStringInParentheses(input));
		
		

		String result = "";

//		System.out.println(input.indexOf('('));
//		System.out.println(input.indexOf(')'));

		int start = input.indexOf('(');
		System.out.println(start);

		int start1 = input.indexOf('(');
System.out.println(start1);
		int end = input.indexOf(')');

		for (int i = start + 1; i <= end - 1; i++) {
//			System.out.println(i);
//			System.out.print(input.charAt(i));
			result = result + input.charAt(i);

		}

		
		System.out.println("\n"+revString(result));
	}
}