package com.java.pratice;

public class Factorial {

	public void factorialNumber() {

		int fact = 1;
		int num = 3;
		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}
		System.out.println("The Factorial is " + fact);
	}

	public static void main(String args[]) {

		Factorial obj = new Factorial();
		obj.factorialNumber();
	}
}
