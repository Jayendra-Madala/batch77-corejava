package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print the factors of a given number
public class TestLPDemo3 {

	public static void main(String[] args) {
	
		System.out.println("MAIN METHOD STARTED");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int numb = sc.nextInt();
		findFactors(numb);
		
		
		System.out.println("main method ended");
	}
	
	static void findFactors(int numb) {
		for(int i = 1 ; i<= numb/2 ; i++ ) {
			if(numb % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(numb);
	}
}
