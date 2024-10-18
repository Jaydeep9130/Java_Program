package com.java.interview;

public class FactorialNumber {

	public void factorialNumber() {
		
		int fact =1;
		int num=6;
		for(int i=1;i<=num;i++) {
			
			fact = fact* i;
			
			System.out.println(fact);
		}
	}
		public static void main(String[] args) {
			
			FactorialNumber obj = new FactorialNumber();
			
			obj.factorialNumber();
		}
}

