package com.tech;

public class add {
	
	public static void main(String[] args) {
		
		add aa= new add();
		System.out.println (aa.revs1("shubham"));
		
		//.out.println(str);
		System.out.println(revs1("raj"));
		
	String str = "RAMARAJYA";
	System.out.println(str.charAt(3));
 
	
		
		
	}
 
	public  static String revs1( String in ) {
		String rev=" ";
		for(int i=0;i<in.length();i++)
			rev=in.charAt(i)+rev;
		return rev;
		
	}
}
