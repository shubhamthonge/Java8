package com.tech;

public class palan {

	
	public static void main(String[] args) {
		 
		String or="mamd";
		String rev="";
		 
		int length=or.length();
		
		for(int i=length-1;i >=0;i--) {
			rev=rev+or.charAt(i);
		}
			if(or.equals(rev)){
				System.out.println(or+" = given string is palindrome");
			}else {
				System.out.println(or+" = given string is not palindrome");
			}
		
	}
}
