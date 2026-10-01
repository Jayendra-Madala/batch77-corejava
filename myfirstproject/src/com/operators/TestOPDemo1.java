package com.operators;

import java.util.Scanner;

// 1 ) Arithmetic operators
// + , - , * , / , %

//WAP to do calculator with methods

public class TestOPDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started !!!");
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 1st number : ");
//		float a1 = sc.nextInt();
//		System.out.println("Enter 2nd number");
//		double a2 = sc.nextInt();
	//	double sum  = addition(a1 , a2);
		
		int a = 10;
		int b = 20;
		 System.out.println("Sum of 2 nums is : " + (a + b));
		
		 System.out.println("multiplication is : " + (a * b));
		 
		 System.out.println("Division is : " + (b/a));
		 
		 System.out.println("Subtraction is : " + (b - a));
		 
		 System.out.println("Remainder after dividing b with a is : " + (b % a) );
		
		System.out.println("Main method ended");
	}
	static double addition(float a , double b) {
		double sum = a + b;
		return sum;
	}
}
