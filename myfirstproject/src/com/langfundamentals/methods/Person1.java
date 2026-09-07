package com.langfundamentals.methods;

public class Person1 {
	
	String name;
	int age;
	double sal;
	
	public Person1() {
		System.out.println("No arg constructor called");
	}
	
	
	public Person1(String name, int age, double sal) {
		super();
		System.out.println("Person1 3 arg constructor called");
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	public static void main(String[] args) {
		System.out.println("Main method started from Person1");
	}

class Employee1 extends Person1{
	
	Employee1 e1 = new Employee1();
	
	public static void main(String args[]) {
		System.out.println("Main method started from Customer");
	}
	
	void show() {
		System.out.println("Employee name is : " + name);
		System.out.println("Employee age is : " + age);
		System.out.println("Employee sal is : " + sal);
		
	}
}
}
