package com.exceptionhandling;

import java.util.Scanner;

public class TestUncheckedException02 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();

			System.out.println("In try");
			System.out.println("Good day");
			System.out.println("Enter your number");
		}
		catch(Exception e) {
			System.out.println("In catch");
		}
		
		System.out.println("Main method ended");
	}

}
