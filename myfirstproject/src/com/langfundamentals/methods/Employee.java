package com.langfundamentals.methods;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		welcome();
		
		Employee e = new Employee();
		e.goodboy();
		
		System.out.println("Main mthod ended");
	}

	
	public static void welcome() {
		System.out.println("Welcome to the java world");
	}
	
	void goodboy() {
		System.out.println("jay is a very good boy");
	}
}
