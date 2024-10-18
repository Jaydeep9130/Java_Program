package com.java.pratice;

public class ReverseString {

	public void reverseString() {

		String name = "Jaydeep";

		String rname = "";

		System.out.println(name.length());
		for (int i = 0; i <= name.length() - 1; i++) {

			rname = name.charAt(i) + rname;

		}
		System.out.println(rname);
	}

	public void reverseString1() {

		StringBuilder name = new StringBuilder("Jaydeep");

		System.out.println(name.reverse());
	}

	public static void main(String[] args) {

		ReverseString obj = new ReverseString();

		obj.reverseString();

		obj.reverseString1();
	}

}
