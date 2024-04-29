package com.tech;


public class add2 {

	static int num = 10;

	public static void fabS() {

		int n1 = 0;
		int n2 = 1;
		int n3;
		for (int i = 2; i < num; i++) {

			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;

		}

	}

	public static String strTrv(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			result = input.charAt(i) + result;
			System.out.println(result);
		}
		return result;
	}

	public static void main(String[] args) {

		// fabS();

//		System.out.println(strTrv("cba"));

		SingleTo s = SingleTo.getInctance();
		s.display();
	}
}
