package com.neotech.review03;

public class MaxIn2DArray {

	public static void main(String[] args) {

		// Task: Find the biggest number in a 2D  Array
		
		int[][] b = {{2, 3, 5},
					{2,4,7},
					{8,1,9},
					{3,5,1}};
		
		int max = b[0][0];
		for (int[] row : b) {
			
			for (int element : row) {
				
				if (element>max)
				{ 
					max = element;

				}
			}
			
		}
		
		System.out.println("The biggest number is -> " + max);
	}

}


