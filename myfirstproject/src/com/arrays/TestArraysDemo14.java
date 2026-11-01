package com.arrays;

public class TestArraysDemo14 {

	public static void main(String[] args) {
		
		int[][][] arr = new int[3][2][3];
		
		arr[0][0][0] = 100;
		arr[1][1][1] = 200;
		arr[2][1][2] = 300;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				for(int k = 0 ; k < arr[i][j].length ; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		System.out.println();
		}
		
	}

}
