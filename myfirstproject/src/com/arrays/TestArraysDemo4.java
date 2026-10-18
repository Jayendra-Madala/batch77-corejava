package com.arrays;
//WAP to print sum and avg of syudent marks
public class TestArraysDemo4 {

	public static void main(String[] args) {
		
		int[] marks = {99,98,97,88,67,43};
		
		int sum = 0 ;
		int avg = 0;
		
		for(int i = 0 ; i < marks.length ; i++) {
			sum = sum + marks[i];
		}
		
		avg = sum / marks.length;
		
		System.out.println("Sum of the marks is : " + sum);
		System.out.println("Avg of the marks is : " + avg);
	}

}
