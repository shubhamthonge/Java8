package com.tech;

public class add3 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		 
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		System.out.println("*********after 1 revers**********");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("*********after 2 revers**********");

		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a=a^b;
		b=a^b;
		a=b^a;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
