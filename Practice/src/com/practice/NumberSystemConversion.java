package com.practice;

import java.util.Scanner;

public class NumberSystemConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int n = sc.nextInt();
		
		String binary = Integer.toBinaryString(n); 
		
		String res = "";
		
		for(int i = 0 ; i < binary.length() ; i++) {
			if(binary.charAt(i) == '0') {
				res += 1;
			}
			else {
				res += 0;
			}
			
		}
		
	int toggle = Integer.parseInt(res,2);
	System.out.println(toggle);
	
	}
}