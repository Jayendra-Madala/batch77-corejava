package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo11 {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean status = isArmstrong(n);

		if (status) {
			System.out.println("The given number is Armstrong number");
		} else {
			System.out.println("The given number is not Armstrong number");
		}

		System.out.println("Main method ended");
	}

	public static boolean isArmstrong(int n) {

		int rem = 0;
		int sumP = 0;
		int temp = n;
		int n1 = n;
		int count = 0;

		// Counting number of digits
//		while (n1 > 0) {
//			n1 = n1 / 10;
//			count++;
//		}
//----------------(OR)---------------------------------------
		//Counting number of digits
		String str = Integer.toString(n);
		int digitCount = str.length();
		
		
		// Finding sum of powers of digits
		while (n > 0) {
			rem = n % 10;
			n = n / 10;

			sumP = sumP + (int) Math.pow(rem, digitCount);
		}

		if (sumP == temp) {
			return true;
		}

		return false;
	}
}