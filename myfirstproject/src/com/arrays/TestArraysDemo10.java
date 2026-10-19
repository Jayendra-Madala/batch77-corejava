package com.arrays;

public class TestArraysDemo10 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		String[][] names = new String[2][3];
		
		names[0][0] = "Java";
		names[0][1] = "Jay";
		names[0][2] = "Srikanth";
		names[1][0] = "SQL";
		names[1][1] = "Spring Boot";
		names[1][2] = "Hibernate";
		
		
		for(int i  = 0 ; i < names.length ; i++) {
			for(int j = 0 ; j < names[i].length ; j++) {
				System.out.print(names[i][j] + " ");
			}
	System.out.println();
		}
		
		System.out.println("Main method ended");
	}

}
