package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo6 {

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
		if(n==0 || n==1) {
			return 1;
		}
		return n *  factorial(n - 1);
	}

}
