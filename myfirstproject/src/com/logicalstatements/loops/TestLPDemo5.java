package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the factorial using for loop
public class TestLPDemo5 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int fact = factorial(n);
		
		System.out.println("The factorial of a given number is : " + fact);
		System.out.println("Main method ended");
	}
	
	public static int factorial(int n) {
		int fact = 1;
		
		for(int i = n ; i >=1 ; i--) {
			fact = fact * i;
		}
		return fact;
	}

}
