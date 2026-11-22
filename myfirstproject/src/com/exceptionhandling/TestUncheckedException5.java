package com.exceptionhandling;

import java.util.Scanner;

public class TestUncheckedException5 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("Enter b number : ");
		int b = sc.nextInt();
		
		int c = a/b;
		System.out.println(c);
		
		System.out.println("Enter a name : ");
		try {
		String name = sc.next();
		System.out.println(name.charAt(4));
		}
		
		catch(Exception e) {
			System.out.println("IN catch block");
			System.err.println("String Index Out Of Bounds Exception");
			System.out.println(e.getStackTrace());
		}
		System.out.println("Main method ended");

	}

}
