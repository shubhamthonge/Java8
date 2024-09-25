package com.tech;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {

		int arr[]= {10,12,13,14,15,22,18,19,25,36};//without using sort methode 
		System.out.println("Before  "+ Arrays.toString(arr));

		int len=arr.length;
		for(int i=0; i<len-1;i++) {
			
			for(int j=0; j<len-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
			
		}
		
		
		System.out.println("After  "+ Arrays.toString(arr));
		
		
	}

}
