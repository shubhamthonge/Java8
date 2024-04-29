package com.tech;

public class SingleTo {
public static SingleTo intbf;


	private SingleTo() {
		System.out.println("addd ");
	}
	
	public static SingleTo getInctance() {
		
		if(intbf==null) {
			intbf= new SingleTo();
		}
		return intbf;
	}

	
	void display() {
		System.out.println("Hello i'm in singletoone");
	}
	
}
