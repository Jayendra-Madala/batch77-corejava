package com.arrays;
//WAP to print names using arrays
public class TestArraysDemo2 {

	public static void main(String[] args) {
		
		String[] names = new String[6];
		
		
		
		names[0] = "Gill";
		names[1] = "Vk";
		names[2] = "MAHI";
		names[3] = "HITMAN";
		names[4] = "IYER";
		names[5] = "RAHUL";
		
		for(int i = 0 ; i < names.length  ; i++) {
			if(names[i].contains("H"))
			System.out.println(names[i]);
		}
		
	}

}
