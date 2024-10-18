package com.java.interview;

public class ReverseString {

	public void reverseString() {
		
		String name= "Jaydeep";
		
		String rname= "";
		
		for(int i=0; i<=name.length()-1;i++) {
			
			rname= name.charAt(i)+rname;
			
			
		}
		System.out.println(rname);
	}
	
	public static void main(String[] args) {
		
		ReverseString re= new ReverseString();
		
		re.reverseString();
	}

}



