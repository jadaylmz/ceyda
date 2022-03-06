package com.neotech.review05;

public class FamilyMember {
	
	String firstName;  //instance variable,belongs to the instance/object
	static String lastName;	//static/class variable, belongs to the class
	int age;	//instance variable,belongs to the instance/object
	
	
	//With non-static methods you can access ALL the variables
	void printFullName() {
		System.out.println("Full name is: " + firstName + " " + lastName);
	}
	//With static methods you can access ONLY static variables

	static void printFamilyName()
	{
		System.out.println("Famiy name is: "  + lastName);
	
	}
	
	
	
}
