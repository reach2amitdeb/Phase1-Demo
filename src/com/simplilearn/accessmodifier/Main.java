package com.simplilearn.accessmodifier;

public class Main {

	public static void main(String[] args) {
		
		//create object
		PersonData personData = new PersonData();
		
		//same package public and protected
		
		//public method
		personData.getAge();
		
		//protected property
		personData.getSalary();
		
		//default property/method
		personData.showAge();
	}

}
