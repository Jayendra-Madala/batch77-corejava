package com.arrays;

public class TestArrDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		int arr[] = new int[10];
		
		arr[0] = 21;
		arr[1] = 22;
		arr[2] = 25;
		arr[3] = 27;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 != 0) {
			System.out.println(arr[i]);
			}
			}
		
		
		
		
		
		
		System.out.println("Main method ended");
	}

}
