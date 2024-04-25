package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntryProgram {
    public static void main(String[] args) {
        List<String> entries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your entries (type 'exit' to finish):");

        String entry;
        while (!(entry = scanner.nextLine()).equalsIgnoreCase("exit")) {
            entries.add(entry);
        }

        System.out.println("\nYour entries:");
        for (String e : entries) {
            System.out.println(e);
        }

        scanner.close();
    }
}
