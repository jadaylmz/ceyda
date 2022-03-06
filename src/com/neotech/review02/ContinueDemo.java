package com.neotech.review02;

public class ContinueDemo {

	public static void main(String[] args) {
		// I want to celebrate my son's birthdays from 11 to 20
		// but not 13th birthday, because we are scared
		// Let's use for loop
		
		
		for(int age =11; age<21; age++) {
			if(age==13) {
				continue;
			}
			System.out.println("Happy Birthday! You are "+ age + " years old!");
		}
		
	}

}
