package com.neotech.review05;

public class SplitDemo {

	public static void main(String[] args) {

		String longStr = "I am very happy today, because today is not Monday";
		
		String[] stringArray = longStr.split("today");
		
		System.out.println(stringArray.length);
		
		System.out.println("-----Iterating using Enhanced for loop-------");
		for (String element : stringArray) {
			System.out.println(element);}
		
		System.out.println("-----------Iterating using Normal for loop-------");
		
		}
		
		
		
		

}
