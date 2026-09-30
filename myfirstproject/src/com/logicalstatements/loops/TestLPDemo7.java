package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo7 {

	public static void main(String[] args) {
		System.out.println("MAIN method started");
		Scanner sc = new Scanner(System.in);	
		System.out.println("How many numbers do you want to print  : ");
		int n = sc.nextInt();
		
		fibonacciSeries(n);
		
		
		System.out.println("MAIN method ended");
		
	}
	
	public static void fibonacciSeries(int n) {
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		System.out.print(n1 + "   " + n2 + "  ");//0
		for(int i = 1 ; i <=n; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3 ;
			
		}
	}

}
