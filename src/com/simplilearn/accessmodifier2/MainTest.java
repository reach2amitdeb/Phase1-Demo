package com.simplilearn.accessmodifier2;

import com.simplilearn.accessmodifier.PersonData;

public class MainTest extends PersonData{

	public static void main(String[] args) {
		
		//create object
		PersonData personData = new PersonData();
		
		//public method : accessable
		personData.getAge();
		
		//protected
		MainTest mainTest = new MainTest();
		
		mainTest.getSalary();
		
	}

}
