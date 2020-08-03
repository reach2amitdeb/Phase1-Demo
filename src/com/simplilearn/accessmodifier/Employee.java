package com.simplilearn.accessmodifier;

public class Employee {
	// WAP for declaring private public and protected methods
	// empId => private
	// empName => public
	// empSalary => protected
	
	// getId() => public
	// getEmpName() => public
	// showSalary() => protected
	
	//TestEmployee in different package and call this above methods.
	
	private int empId = 10000;
	public String empName = "Amit";
	protected double empSalary = 7000000;
	
	public int getId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	protected double showSalary() {
		return empSalary;
	}
	
}
