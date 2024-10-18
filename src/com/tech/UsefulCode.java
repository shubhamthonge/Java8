package com.tech;
import java.util.ArrayList;
import java.util.List;

public class UsefulCode {
		    public List<Integer> filterThree(int[] input) {
	        // Create a new list to store the filtered values
	        List<Integer> filteredList = new ArrayList<>();
	        
	        // Iterate through the input array and add values not divisible by 3 to the list
	        for (int num : input) {
	            if (num % 3 != 0) {
	                filteredList.add(num);
	            }
	        }
	        
	        return filteredList;
	    }

	    public static void main(String[] args) {
	        UsefulCode usefulCode = new UsefulCode();
	        int[] input = {3, 5, 6, 7, 9, 10, 12};
	        
	        // Call the method and store the result
	        List<Integer> result= usefulCode.filterThree(input);
	        
	        // Print the result
	        System.out.println(result);  // Output: [5, 7, 10]
	    }
}