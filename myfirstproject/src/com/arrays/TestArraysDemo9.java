package com.arrays;

public class TestArraysDemo9 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		
		
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		arr[0][3] = 200;
		
		
		arr[1][0] = 700;
		arr[1][1] = 800;
		arr[1][2] = 1900;
		arr[1][3] = 10;
		
		
		arr[2][0] = 120;
		arr[2][1] = 102;
		arr[2][2] = 104;
		arr[2][3] = 160;
		
		
		for(int i = 0  ; i < arr.length ; i++) {
			
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
