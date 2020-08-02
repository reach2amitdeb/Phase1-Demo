package com.simplilearn.typecasting;

public class FirstTypeDemo {

	public static void main(String[] args) {
		
		// Widening or Automatic or Implicit Typecasting
		//byte->short->int->long->float->double
		
		byte countByte = 127;
		
		int count = 100;
		
		long countBig = count;
		
		float countFp = countBig;
		
		double countDouble = countFp;
		
		double byteToDouble = countByte;
		
		
		System.out.println("Int value :"+count);
		System.out.println("Long value :"+countBig);
		System.out.println("Float value :"+countFp);
		System.out.println("Double value :"+countDouble);

	}

}
