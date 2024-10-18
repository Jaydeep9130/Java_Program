package com.java.interview;

public class SpaceRemove {

	public void spaceRemove() {

		String str = "I love my    india ";
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
	}

	public static void main(String[] args) {

		SpaceRemove obj = new SpaceRemove();

		obj.spaceRemove();
	}

}
