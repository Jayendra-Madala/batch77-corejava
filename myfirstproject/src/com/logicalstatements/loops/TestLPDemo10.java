package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo10 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int revis = reverseNmbr(n);
		System.out.println("Reverse of the number is : " + revis);
		
		if(n == revis) {
			System.out.println("The give num is palindrome");
		}
		
		else {
			System.out.println("Not a palindrome");
		}
		
		System.out.println("Main method started");

	}
	public static int reverseNmbr(int n) {
		int rev = 0;
		int rem = 0;
		
		while(n>0) {
				rem = n % 10;
				n = n / 10;
				rev = rev * 10 + rem;
		}
		
		return rev;
	}

}
