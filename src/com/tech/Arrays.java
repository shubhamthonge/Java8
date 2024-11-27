package com.tech;

import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		
	
	int[] numbers = {1, 2, 3, 4, 5};
	int target = 3;
	boolean found = false;

	for (int num : numbers) {
	    if (num == target) {
	        found = true;
	        break;
	    }
	

	System.out.println("Element " + target + (found ? " found." : " not found."));

}
}

	public static Object asList(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Integer> asList(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}
}