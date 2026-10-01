package com.operators;
//Bit wise operators
public class TestOPDemo6 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		System.out.println(true & true); //true
		System.out.println(1 & 1);//1
		
		System.out.println(true & false); // false
		System.out.println(1 & 0);//0
		
		System.out.println(false & true);
		System.out.println(0 & 1);//0
		
		System.out.println(false & false);//false
		System.out.println(0 & 0);//0
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(71 & 87);	
		System.out.println(39 & 45);	
		System.out.println(76 & 49);	
		System.out.println(69 & 76);	
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(71 | 87);
		System.out.println(49 | 85);
		System.out.println(79 | 69);
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(true ^ true);//false
		System.out.println(1 ^ 1);
		System.out.println(true ^ false);//true
		System.out.println(1 ^ 0);
		System.out.println(false ^ true);//true
		System.out.println(0 ^ 1);
		System.out.println(false ^ false);//false
		System.out.println(0 ^ 0);
		
		System.out.println(54 ^ 67);
		System.out.println(82 ^ 39);
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(~21);
		System.out.println(~100);
		
		}
	}


