package com.tech;

import java.util.Scanner;

public class boxVolume extends Shape {
    // Constructor to initialize length, breadth, and height
    public boxVolume(int length) {
        this.length = length;
        this.breadth = 2 * length;
        this.height = 4 * breadth;
    }

    // Method to calculate the volume of the box
    @Override
    public int calcVolume() {
        return length * breadth * height;
    }


// Main class to test the implementation

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the box: ");
        int length = scanner.nextInt();
        scanner.close();
        
        // Create an instance of boxVolume
        boxVolume box = new boxVolume(length);
        
        // Print the volume of the box
        System.out.println("Volume of the box: " + box.calcVolume());
    }
    }


