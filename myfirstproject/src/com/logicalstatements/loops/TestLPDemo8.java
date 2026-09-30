package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo8 {

	public static boolean isPrime(int n) {
		if(n < 2) {
			return false;
		}

		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("MAIn method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter upto where do you want to print prime numbers : ");
		int n = sc.nextInt();

		for(int i = 0; i <= n; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}

		System.out.println("MAIn method ended");
	}
}