package com.simplilearn.typecasting;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// WAP for taking user Input as string
		// Integer Byte Float and Double
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("User Input :");

		String str = input.nextLine();
				
		int strToInt = Integer.parseInt(str);
		
		byte strToByte = Byte.parseByte(str);
		
		float strToFloat = Float.parseFloat(str);
		
		double strToDouble = Double.parseDouble(str);
		
		System.out.println("String value: "+str);
		System.out.println("Int value: "+strToInt);
		System.out.println("Byte value: "+strToByte);
		System.out.println("Float value: "+strToFloat);
		System.out.println("Double value: "+strToDouble);

		
	}

}
