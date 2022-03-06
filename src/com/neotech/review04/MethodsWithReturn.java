package com.neotech.review04;

public class MethodsWithReturn {

	
	boolean isOdd (int num) {
		boolean result;
		if(num%2 == 1) {
			result = true;
					
		}else {
			result = false;
		}
		return result;
	}
	
	boolean isOddEnhanced(int num) {
		return num%2 ==1;
	}
	
	public static void main(String[] args) {
		
		String name = "Timucin";
		int numOfChars = name.length();
		
		System.out.println("The lenght of " + name + " is " + numOfChars);
		
		MethodsWithReturn m = new MethodsWithReturn();
		boolean res = m.isOdd(90);
		System.out.println("90 is odd -> " + res);
		System.out.println(m.isOdd(57));
	}
	
	
}
