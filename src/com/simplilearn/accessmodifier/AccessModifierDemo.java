package com.simplilearn.accessmodifier;

class Person{
	
	// member variable
	private int age = 40;
	
	protected double salary = 100099.90;
	
	//member method
	void showAge() {
		System.out.println("Age is 40");
	}
	
	public int getAge() {
		return age;
	}
	
	protected double getSalary() {
		return salary;
	}
	
}

public class AccessModifierDemo {

	public static void main(String[] args) {
		
		Person person= new Person();
		
		System.out.println("The age is :"+person.getAge());
		person.showAge();
		
		System.out.println("The salary is :"+person.salary);
		
	}

}
