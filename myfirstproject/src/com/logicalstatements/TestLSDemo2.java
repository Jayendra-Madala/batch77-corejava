package com.logicalstatements;

import java.util.Scanner;
public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name : ");
		
		String Fullname = sc.nextLine();
		
		if(Fullname.length() >= 15) {
			System.out.println("Your name is too lonng please shorten your name");
		}
		
		else {
			System.out.println(Fullname);
		}
	}

}
