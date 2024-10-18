package com.java.pratice;

public class SpaceRemove {

	public void spaceRemove() {

		String str = "India     Is My    Country";
		// 1st way
		String noSpaceStr = str.replaceAll("\\s", ""); // using built in method
		System.out.println(noSpaceStr);
	}

	public static void main(String[] args) {

		SpaceRemove obj = new SpaceRemove();

		obj.spaceRemove();

	}

}
