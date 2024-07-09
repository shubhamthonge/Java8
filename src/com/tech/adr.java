package com.tech;

public class adr {
	
	public static void fibo() {
		
		int s1=0;
		int s2=1;
		int s3;
		
		for(int i=2;i<10;i++) {
			s3=s1+s2;
			System.out.println(s3);
			s1=s2;
			s2=s3;
		}
	}

	public String rak(String in) {
		String a=" ";
		
		for(int i=0;i<in.length();i++) {
			a=in.charAt(i)+a;
			
		}
		return a;

	}
	
	
	public static void main(String[] args) {
		adr a= new adr();
		//System.out.println(a.rak("shubham"));
		a.fibo();
	}
}
