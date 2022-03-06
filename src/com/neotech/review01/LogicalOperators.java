package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		String result = "";
		
		
		if(age >=1 && age<=3) {
			System.out.println("You re a baby");	
		}else if(age >= 4 && age<=5 ){
			System.out.println("You re a toddler");
		}else if (age >= 6 && age <= 12){
			System.out.println("You re a kid");
			
		}else if (age >=13 && age<=19) {
			result="teenager";
		}else if (age>=20) {
			result="adult";
		}else{
			result = "alien";
		}
		System.out.println("You are a/an " + result);
	}

}
