package com.exceptionhandling;

public class TestUncheckedException4 {

	public static void main(String[] args) {
		int[] arr = new int[4];
		
		try {
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 90;
		arr[4] = 10;
		}
		
		catch(Exception c) {
			System.out.println(c.toString());
		}
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
