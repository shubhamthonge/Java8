package com.tech;

public class Testt{
 
	 private String T= "Shubham";
	  
	 public void test2() {
		 System.out.println("shubham in test outer class");
	 }
	 
	 class inner {
		
		 public void test3() {
			 System.out.println("shubham in inner class");
			
		}
	 }
	 
	  public static void main(String[] args) {
		 
		  Testt t= new Testt();
		  t.test2();
		  System.out.println(t.T);
		  System.out.println("**************************************");
		  Testt.inner in= t.new inner();
		  in.test3();
		  
	}
}
