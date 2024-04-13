package com.tech;

public class java {

	public static void main(String[] args) {
        int[] inputarr = {44, 33, 64, 54, 24, 14 , 52};

        if (inputarr.length < 3) {
            System.out.println("Array does not have a 3rd highest number");
        } else {
            int fmax = Integer.MIN_VALUE;
            int smax = Integer.MIN_VALUE;
            int tmax = Integer.MIN_VALUE;

            for (int i = 0; i < inputarr.length; i++) {
                if (inputarr[i] > fmax) {
                    tmax = smax;
                    smax = fmax;
                    fmax = inputarr[i];
                } else if (inputarr[i] > smax) {
                    tmax = smax;
                    smax = inputarr[i];
                } else if (inputarr[i] > tmax) {
                    tmax = inputarr[i];
                }
            }
            System.out.println("Third highest number: " + tmax);
        }
    }
}