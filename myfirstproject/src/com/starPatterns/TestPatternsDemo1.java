package com.starPatterns;

import java.util.Scanner;

public class TestPatternsDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of stars you want to print : ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i ++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("Main method started");

	}

}
