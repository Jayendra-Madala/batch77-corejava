package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo4 {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		boolean flag = isPerfect(n);
		
		if(flag) {
			System.out.println("Given number is perfect");
		}
		
		else {
			System.out.println("Given number is not perfect");
		}
		
		
		
		
		System.out.println("Main method ended");
	}
	
	static boolean isPerfect(int n) {
		boolean status = false;
		int sum  = 0;
		for(int i = 1 ; i <=n / 2 ; i++ ) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
		
		if(sum == n) {
			status = true;
		}
		return status;
	}

}
