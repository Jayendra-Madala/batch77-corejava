package com.logicalstatements.loops;
// WAP to print even and odd numbers from 0 to 100
public class TestLPLDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		for(int i = 0; i <= 100 ; i++) {
			
			if(i % 2 == 0 && i != 0) {
				System.out.println("The even numbers between 0 to 100 are : " + i );
			}
		}
		System.out.println("------------------------------------------------------------------------------");
		for(int i = 0; i <= 100 ; i++) {
			
			if(i % 2 == 1 && i != 0) {
				System.out.println("The odd numbers between 0 to 100 are : " + i );
			}
		}
		System.out.println("Main method ended");
	}

}
