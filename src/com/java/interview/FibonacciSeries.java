package com.java.interview;

public class FibonacciSeries {

	public void fibonacciSerires() {

		int a= 0;
		int b=1;
		int c;
		int count= 10;
		
		for(int i=2; i<=count;i++) {
			
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}

	public static void main(String[] args) {

		FibonacciSeries fb= new FibonacciSeries();
		
		fb.fibonacciSerires();
	}

}
