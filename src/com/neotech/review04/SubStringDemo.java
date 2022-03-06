package com.neotech.review04;

public class SubStringDemo {

	
	public static void main(String[] args) {
		
	
	String longStr = "I am very happy today because today is not Monday";
	
	String anotherStr = longStr.substring(5,7);
	System.out.println(anotherStr);
	
	anotherStr = longStr.substring(5);
	System.out.println(anotherStr);
	

	
	System.out.println("longStr -> " + longStr); //Not Changed
	
	longStr = longStr.substring(10); //reassigning
	System.out.println("longStr -> " + longStr); //longStr is changed
	
	
	}
}
