package com.javaintro;

public class Employee {
	static Employee Jay = new Employee();
	static {
		
		System.out.println("Static block called");
	
		
	}
	
	
	{
		System.out.println("Instance block called");

	
	
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Main method started");
		
	}

}
