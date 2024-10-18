package com.java.pratice;

public class JavaPraticeQuestions {

	public void reverseString() {

		String ch = "Jaydeep";
		String chr = "";

		for (int i = 0; i <= ch.length() - 1; i++) {

			chr = ch.charAt(i) + chr;
		}
		System.out.println(chr);

	}

	public void FactorialProgram() {

		int num = 1;
		int num2 = 10;

		for (int i = 1; i <= num2; i++) {

			num = num * i;
		}
		System.out.println(num);

	}

	public void FabbinassoProgram() {

        int numTerms = 10; // Change this to the desired number of terms

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
	
	



	public static void main(String[] args) {

		JavaPraticeQuestions obj = new JavaPraticeQuestions();
		obj.reverseString();
		obj.FactorialProgram();
		obj.FabbinassoProgram();

	}
}
