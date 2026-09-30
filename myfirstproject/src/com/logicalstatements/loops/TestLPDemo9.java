package com.logicalstatements.loops;

import java.util.Scanner;
//WAP to print sum of digits of a given number
public class TestLPDemo9 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sd = sumOfDigits(n);
		System.out.println("Sum of digits is :  " + sd);
		System.out.println("Main method ended");
	}
	
	static int sumOfDigits(int n){
		int sum = 0;
		int rem ;
		while(n > 0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + rem;
			
		}
		return sum;
	}

}
