package com.langfundamentals.methods;

import java.util.*;
public class Customer {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name : " );
		String name = sc.nextLine();
		getCustomerName(name);
		
		System.out.println("Enter your number :");
		long phone = sc.nextLong();
		getCustomerNumber(phone);
		
		System.out.println("Enter your Age :");
		int age = sc.nextInt();
		getCustomerAge(age);
		
		System.out.println("Enter your Id :");
		long id = sc.nextLong();
		customerId(id);
		
		System.out.println("Main method ended");
	}
	static void getCustomerName(String name) {
		System.out.println("Customer name is : " +name);
	}
	
	static void getCustomerNumber(long phone) {
		System.out.println("Customer number is : " + phone);
	}
	
	static void getCustomerAge(int age) {
		System.out.println("Customer age is : " + age);
	}
	
	static void customerId(long id)
	{
		System.out.println("Customer id is : " + id);
	}
	
}
