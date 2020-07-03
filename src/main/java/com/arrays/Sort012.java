package com.arrays;// Java program to find GCD of two or
// more numbers 

public class Sort012 {
	// Function to return gcd of a and b 


	public static void main(String[] args) 
	{ 
		int arr[] = { 0,0,0,1,1,0,2,0,1,2,1,0 };
		int n = arr.length;
	}


	public static void sort(int arr[]){

		int low =0;
		int mid =0;
		int high = arr.length-1;
		int temp =0;
        while(mid<=high) {
			switch (arr[mid]) {

				case 0: {
					temp = arr[low];
					arr[low] = arr[mid];
					arr[mid] = temp;
					low++;
					mid++;
					break;
				}
				case 1: {
					mid++;
					break;
				}

				case 2:
					temp = arr[mid];
					arr[high] = arr[mid];
					arr[mid] = temp;
					high--;
					break;


			}
		}

	}

} 

// This code is contributed by Saket Kumar 
