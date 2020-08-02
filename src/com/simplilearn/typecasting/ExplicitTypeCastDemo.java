package com.simplilearn.typecasting;

public class ExplicitTypeCastDemo {

	public static void main(String[] args) {
		
		//Explicit Type cast or narrowing
		//double->float->long->int->short->byte
		
		double price = 100.49;
		
		long priceBig = (long) price;
		
		int priceInt = (int) price;
		
		byte priceByte = (byte) price;
		
		System.out.println("Double Price Value:"+price);
		System.out.println("Long Price Value:"+priceBig);
		System.out.println("Int Price Value:"+priceInt);
		System.out.println("Byte Price Value:"+priceByte);

	}

}
