package com.tech;

public class add  extends javar{
	
	public static void main(String[] args) {
		
//		String strv = name("Shubham");
//		System.out.println(strv);
		//String str = revs1("Shubham");
		//System.out.println(str);
		System.out.println(revs1("raj"));
		
	String str = "RAMARAJYA";
	System.out.println(str.length());
	System.out.println(str.charAt(3));
	
		
		
	}
 
	public  static String revs1( String in ) {
		String rev=" ";
		for(int i=0;i<in.length();i++)
			rev=in.charAt(i)+rev;
		//System.out.println(rev);
		return rev;
		
	}
}
