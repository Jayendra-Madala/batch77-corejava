package com.logicalstatements;

import java.util.*;

public class TestLSDemo3 {

	public static void main(String[] args) {
		
		System.out.println("MAIN METHOD STARTED");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your sal : ");
		double sal = sc.nextDouble();
		
		if(sal > 600000) {
			System.out.println("You are eligible for personal loan");
		}
		
		else {
			System.out.println("Career medha focus pettu");
		}
	}

}
