package com.arrays;

//WAP to print minimum and maximum element from an array
public class TrestArraysDemo5 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		int[] nums = {7,18,45,81,17,26,5};
		
		int min = nums[0];
		int max = nums[0];
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] < min) {
				min = nums[i];
				
			}
			
			else if(nums[i] > max) {
				max = nums[i];
			}
		}
		

		System.out.println("Minimum number is : " + min);
		
		System.out.println("Maximum number is : " + max);
		
		System.out.println("Main method started");
	}

}
