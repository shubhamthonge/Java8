package com.tech;

public class reverse {

	static int fib=10;
	
	public  static void name() {
	
		int s1=0;
		int s2=1;
		int s3;
		
		for(int i=2; i< fib; i++) {
			s3=s1+s2;
			System.out.println(s3);
			s1=s2;
			s2=s3;
		}
	}
	
	public static String name1( String in) {
		String add="";
		for (int i=0; i< in.length(); i++) {
			add= in.charAt(i)+add;
			//System.out.println(add);
		}
		
		return add;
		
	}
	
	public static void main(String[] args) {
		name();
		//System.out.println(name1("shubham"));
		
	}
	
}
