package com.arrays;

public class TestArraysDemo11 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		int[][] arr = new int[2][];
		
		arr[0] = new int[3];
		arr[1] = new int[2];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		System.out.println("Main method started");
	}

}
