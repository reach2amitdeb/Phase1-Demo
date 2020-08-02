package com.simplilearn.typecasting;

import java.util.Scanner;

public class TypeConvBasedOnUserInput {

	public static void main(String[] args) {
		
		// User Input From Console
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number from 1 to 100: ");
		
		int userNumber = input.nextInt();
		
		System.out.println("User Input :"+userNumber);
		
	}

}
