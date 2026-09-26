package com.logicalstatements;

import java.util.*;
// program for printing grade based on his marks
public class TestLSDemo4 {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		
		double marks = sc.nextDouble();
		
		if(marks >= 100 || marks < 0) {
			System.out.println("Invalid marks");
		}
		
		else if(marks > 90) {
			System.out.println("Your grade is A");
		}
	
		else if(marks > 80) {
			System.out.println("Your grade is B");
		}
	
		else if(marks > 70) {
			System.out.println("Your grade is C");
		}	
		
		else if(marks > 60) {
			System.out.println("Your grade is D");
		}
		
		else if(marks > 50) {
			System.out.println("Your grade is E");
		}
		
		else if(marks >= 40) {
			System.out.println("You are just pass");
		}
		
		else {
			System.out.println("You failed");
		}
	
	
	
	}
	

}
