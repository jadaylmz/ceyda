package com.neotech.review04;

public class Baby {

	String name;
	char gender;
	int weight;
	String hairColor;
	
	void talk() {
		System.out.println(name + " is talking");
	}
	void talk(String word, int times) {
		for (int i=0; i<times; i++) {
			System.out.print(word+ ", ");
		}
		System.out.println();
	}
	
	void cry() {
		System.out.println(name + " is crying");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	void displayInformation() {
		System.out.println(name+ " , gender is " + gender + " ,weight is " + weight);
		
	}
	
	
}
