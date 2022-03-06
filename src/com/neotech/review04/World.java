package com.neotech.review04;

public class World {

	public static void main(String[] args) {
		
		//Declaring and assigning a variable
		Baby baby1 = new Baby();
		baby1.name = "Daler";
		baby1.weight =8;
		
		System.out.println("The name of baby1 is " + baby1.name);
		System.out.println("The hair color of baby1 is " + baby1.hairColor);
		
		baby1.gender = 'M';
		baby1.hairColor = "Brown";
		System.out.println("The hair color of baby1 is " + baby1.hairColor);
		
		System.out.println("-------------------------");
		
		//Declaring a variable of type Baby
		Baby baby2;
		
		//System.out.println(baby2.name);
		
		//Creating a baby and assigning it ti the variable
		baby2 = new Baby();
		//System.out.println(baby2.name); -->it shows null
		
		baby2.weight = 7;
		baby2.gender = 'F';
		baby2.name = "Aisha";
		baby2.hairColor = "Black";
		
		System.out.println("The hair color of baby1 is " + baby1.hairColor);
		System.out.println("The hair color of baby2 is " + baby2.hairColor);
		
		
		System.out.println("--------------------");
		
		baby1.cry();
		baby2.cry();
		
		baby1.talk();
		
		System.out.println("---------------");
		
		baby1.displayInformation();
		baby2.displayInformation();
		
		
		baby1.talk("Bla", 5);
		baby2.talk("gugu", 3);
		
		
		
		
		
		
		
	}
}
