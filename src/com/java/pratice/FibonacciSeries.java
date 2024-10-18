package com.java.pratice;

public class FibonacciSeries {

	public void fibonacciSeries() {

		int a = 0;
		int b = 1;
		int c;
		int count = 10;

		for (int i = 2; i < count; i++) {
			c = a + b;
			System.out.println(c);

			a = b;
			b = c;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		FibonacciSeries obj=new FibonacciSeries();
		
		obj.fibonacciSeries();
		
		

	}

}
