package com.arrays;

public class TestArraysDemo13 {

	public static void main(String[] args) {
		int[][] arr = {{10,23,45},{20,11,3,4},{30,12,3}};
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
	System.out.println();
		}
		
	}

}
