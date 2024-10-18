package com.java.interview;

import java.security.DomainCombiner;

public class PalindromString {

	public void palindrom() {
		
		String name="Jaydeep";
		StringBuilder tname= new StringBuilder(name);
		
		StringBuilder rname= tname.reverse();
		
		if(name.equalsIgnoreCase(rname.toString())) {
			
			System.out.println("String is palindrom");
			
			}
		else{
			System.out.println("String is not palindrom");
			
		}
	}
		public static void main(String[] args) {
			
			PalindromString obj= new PalindromString();
			obj.palindrom();
			
			
		}
		
		
	}
