package com.neotech.review02;

public class MagicDollar {

	public static void main(String[] args) {
		//Task
		//$$$$$
		//$$$$$
		//$$$$$
		//$$$$$
		
		
		for(int i = 1; i<=4; i++) {
			
			for(int j = 1; j<= 5; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		//Task 2
		//$$$$$
		//$   $
		//$   $
		//$$$$$
		
		System.out.println("===================");
		
		for (int a = 1; a<=4; a++) {
			
			for(int b = 1; b<= 5; b++) {
				if(a==1 || a==4 || b==1 || b==5)
				{
					System.out.print("$");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		
	}

}
