package com.logicalstatements;

import java.util.Scanner;
public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("MAin method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You are eligible for voting and driving");
		}
		
		else {
			System.out.println("You are not eligible");
		}
	}

}
