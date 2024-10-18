package com.java.pratice;

import java.util.Scanner;

public class Palidromprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();

        if (input.equalsIgnoreCase(reversedString.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}