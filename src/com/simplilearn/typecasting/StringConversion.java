package com.simplilearn.typecasting;

public class StringConversion {

	public static void main(String[] args) {
		
		String price = "100";
		
		int priceInt = Integer.parseInt(price);
		
		System.out.println("The String Value :"+price);
		System.out.println("The Integer Value :"+priceInt);
		
		int num = 10;
		
		String data = String.valueOf(num);
		
		System.out.println("The String Value :"+data);

	}

}
