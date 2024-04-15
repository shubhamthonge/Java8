package com.tech;

public class Singleton{

	private static Singleton singleton;

	
	
	private Singleton(Singleton singleton) {
		super();
		this.singleton = singleton;
	}
	

	private Singleton() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static Singleton obj () {
		if (singleton == null ) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
	public static void main(String[] args) {
		
		//obj();
		System.out.println(obj());
		System.out.println(obj());
		System.out.println(obj());
		System.out.println(obj());
		
	}
	
}
