package com.neotech.review05;

public class FamilyDemo {

	public static void main(String[] args) {

		//I cannot access instance variables before I create an object
		//FamilyMember.firstName = "Lebron";
		
		//I CAN access class/static variables before I create an object
		FamilyMember.lastName = "James";
		
		//I CANNOT access non static methods before I create an object
		// FamilyMember.printFullName();
		
		//I CAN access static methods before I create an object
		FamilyMember.printFamilyName();
		
		System.out.println("----------------------------------");
		
		FamilyMember member1 = new FamilyMember();
		member1.firstName = "LeBron";
		member1.age = 36;
		
		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Savannah";
		member2.age = 34;
		
		member1.printFullName();
		member2.printFullName();
		System.out.println("----------------------------");
		
		System.out.println("They went to the court and changed their lastname!!!!");
		member2.lastName = "Smith";
		member1.printFullName();
		member2.printFullName();
		
		//They have a baby
		FamilyMember baby = new FamilyMember();
		System.out.println("First Name -> " + baby.firstName);
		System.out.println("Last Name - > " + FamilyMember.lastName);
	}

}
