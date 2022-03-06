package com.neotech.review04;

public class Besa {

	//A method with NO parameters and No return type
	void addTwoNumbers() {
		System.out.println("I am inside addTwoNumbers");
		int result = 3 + 4;
		
	}
	//A method with TWO parameters and No return type
	void addTwoNumbersThatGiven (int num1, int num2) {
		System.out.println("I am inside addTwoNumbersThatGiven");

		int result = num1 + num2;
	}
	
	//A method with NO parameters and WITH return type
	int addTwoNumbersAndGiveMeTheResult() {
		System.out.println("I am inside addTwoNumbersAndGiveMeTheResult");
		int result = 3+4;
		return result;
	}
	
	//A method with TWO parameters and WITH return type
	int AddTwoNumbersThatIGiveMeTheResult(int num1,int num2) {
		System.out.println("I am inside addTwoNumbersThatIGiveMeTheResult");
		int result =num1 + num2;
		return result;
	}
	
}
