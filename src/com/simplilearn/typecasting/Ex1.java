package com.simplilearn.typecasting;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// WAP to take user input as int value and convert into
		// float double and byte.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("User Input:");
		
		int integer = input.nextInt();
		
		float intToFloat = integer;
		
		double intToDouble = integer;
		
		byte intToByte = (byte)integer;
		
		System.out.println("Int value : "+integer);
		System.out.println("Float value : "+intToFloat);
		System.out.println("Double value : "+intToDouble);
		System.out.println("Byte value : "+intToByte);


	}

}
