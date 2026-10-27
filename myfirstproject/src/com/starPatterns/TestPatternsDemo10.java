package com.starPatterns;

public class TestPatternsDemo10 {

	public static void main(String[] args) {
		for(int i = 1 ; i <=5 ; i++) {
		for(int j = 1,p = 'a' ; j <= i ; j++,p++) {
			
		
			System.out.print((char)p);
		}
		System.out.println();
		}
	}

}
