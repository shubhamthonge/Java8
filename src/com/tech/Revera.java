package com.tech;

public class Revera {
	
	public static String name(String input) {
		String result="";
		for(int i=0;i< input.length(); i++) {
			result= input.charAt(i)+result;
			//System.out.println(result);
		}
		return result;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(name("rajkuma"));
	}
	
}
