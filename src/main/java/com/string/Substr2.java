package com.string;

// Java code to demonstrate the
// working of substring(int begIndex, int endIndex) 
public class Substr2 { 
	public static void main(String args[]) 
	{ 

		// Initializing String 
		String Str = new String("Geeks");

		// using substring() to extract substring 
		// returns geeks 
		System.out.print("The extracted substring is : ");
		System.out.println(Str.length());
		System.out.println(Str.substring(1,Str.length()-1));
	} 
} 
