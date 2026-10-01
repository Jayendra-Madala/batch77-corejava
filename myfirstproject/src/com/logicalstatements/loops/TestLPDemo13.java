package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your binary number : ");
		int n = sc.nextInt();
		binToDec(n);
	}
	
	public static void binToDec(int n) {
		int rem = 0;
		int dec = 0;
		int base = 1;
		
		while(n > 0) {
			rem = n % 10;
			dec = dec + rem * base;
			base = base * 2;
			n = n / 10;
		}
		
		System.out.println("The decimal is : " + dec);
	}
}
