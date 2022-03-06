package com.neotech.review04;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Pershendetje";
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str); //The original has not be changed
		
		boolean equal = str.equals("pershendetje");
		System.out.println(equal);
		
		System.out.println(str.equalsIgnoreCase("pershendetje"));
		
		System.out.println("--------------------");
		System.out.println(str.contains("SH"));
		System.out.println(str.contains("SH".toLowerCase()));
		
		boolean starts = str.startsWith("p");
		System.out.println(starts);
		
		System.out.println();
		
		
		
		
		System.out.println("-----------------------");
		
		String str2 = "Hello" + " " + "World";
		System.out.println(str2);
		
		
		String str3 = "Hello".concat(" ").concat("World"); //Method Chaining
		System.out.println(str3);
		
		System.out.println("Hello".toUpperCase().concat(" ").concat("World"));
		
		
		String str4 = "    Hello World   ";
		System.out.println(str4.trim().length());
		System.out.println(str4.trim());
		
		
		String str5 = "Hi There";
		char letter = str5.charAt(5);
		System.out.println(letter);
		
		System.out.println(" ------------------");
		
		System.out.println(str5.indexOf('h'));
		System.out.println(str5.indexOf('e'));
		
		// Find the index of e, but start looking after index 6
		int indexOfSecondE = str5.indexOf('e', 6); 
		System.out.println("indexOfSecondE -> " + indexOfSecondE);
		
		
		
		
		
		
		
		
		
	}

}
