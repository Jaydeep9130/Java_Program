package com.java.pratice;

import java.util.Scanner;

public class SwapNumber {

	public void swapNumber() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your first number");

		int a = sc.nextInt();

		System.out.println("Enter your second Number");

		int b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swaping the a is " + a + " and b is " + b);
	}

	public static void main(String[] args) {

		SwapNumber obj = new SwapNumber();
		obj.swapNumber();
	}
}
