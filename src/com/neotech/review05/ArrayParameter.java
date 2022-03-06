package com.neotech.review05;

public class ArrayParameter {

	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 6, 1, 8 };

				System.out.println("The values indide the array are:");
				for (int el : array) {
					System.out.print(el + " ");
				}
				System.out.println();

				ArrayParameter ap = new ArrayParameter();
				
				int result = ap.largestNumber(array);
				System.out.println("The largest number int the array is -> " + result);
		
				result = ap.arraySum(array);
				System.out.println("The sum of the array is -> " + result);
				
				double d = ap.arrayAvg(array);
				System.out.println("The avg of the array is -> " + d);

	}
			
			// Task2
			// Create a method that will get an array of integers,
			// and return the sum
			// Make the method protected
			
				protected int arraySum(int[] arr) {
					
					int sum = 0;
					
					for(int el : arr) {
						sum += el;
					}
					
					return sum;
				}
	
			
			// Task3
			// Create method that will get an array of integers,
			// and return the average as a double
			// Make the method private
			
			private double arrayAvg(int[] arr) {
				double sum = 0; 				//double sum = arraySum(arr); //I am calling arraySum() method and passing arr
												//double avg = sum / arr.lenght();
				for(int el : arr) {				//return avg;
					sum += el;
				}
				double avg = sum/arr.length;
				return avg;
			}
				
				
				

		public int largestNumber(int[] arr) {
				int largest = arr[0];

				for (int el : arr) {
					if (el > largest) {
						largest = el;
					}
				}

		return largest;
	
			
	}

}
