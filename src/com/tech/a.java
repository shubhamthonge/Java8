package com.tech;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();

        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series up to " + limit + " terms: ");
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < limit; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            num1 = num2;
        }
    }
}
