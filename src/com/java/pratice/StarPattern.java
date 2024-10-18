package com.java.pratice;

import java.util.*;

public class StarPattern {

	public void starPattern() {

		for (int i = 0; i < 5; i++) {
			// Print spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// Print asterisks
			for (int j = i; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public void starPattern1() {
		
		for (int i = 0; i  <  5; i++) {
            // Print spaces
            for (int j = 5; j  >  i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k  <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	

	

	public static void main(String[] args) {

		StarPattern obj = new StarPattern();

		obj.starPattern();
	}

}
