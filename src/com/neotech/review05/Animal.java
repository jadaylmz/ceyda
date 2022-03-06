package com.neotech.review05;

public class Animal {

		String type;
		String color;
		static int count;
		
		public static void main(String[] args) {
			
			Animal a1 = new Animal();
			a1.type ="bear";
			a1.color = "white";
			a1.count++;
			
			Animal a2 = new Animal();
			a2.type ="wolf";
			a2.color = "black";
			a2.count++;
			
			Animal a3 = new Animal();
			a3.type = "giraffe";
			a3.color = "red";
			Animal.count++;
			
			System.out.println(Animal.count);
			
		}
		
}
