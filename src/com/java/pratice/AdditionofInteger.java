package com.java.pratice;

import java.util.Scanner;

public class AdditionofInteger {
	
	
//	public void addtionOfTwonumber() {
//		
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the two integer");
//		
//		long a= sc.nextInt();
//		
//		long b= sc.nextInt();
//		
//		long c;
//		
//		c=a+b;
//		
//		System.out.println(c);
//		
//	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = scanner.nextInt();
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num/10;
		}

		System.out.println("Sum of digits: " + sum);
		
	}

	
}
