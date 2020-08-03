package com.simplilearn.accessmodifier2;

import com.simplilearn.accessmodifier.Employee;

public class TestEmployee extends Employee{

	public static void main(String[] args) {
		
		TestEmployee details = new TestEmployee();
		
		System.out.println("Employee Id: "+details.getId());
		System.out.println("Employee Name: "+details.getEmpName());
		System.out.println("Employee Salary: "+details.showSalary());
		
		
	}

}
