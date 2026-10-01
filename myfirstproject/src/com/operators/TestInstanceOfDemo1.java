package com.operators;
//Instance of
public class TestInstanceOfDemo1 {

	public static void main(String[] args) {
		Integer i = 10;
		System.out.println(i instanceof Integer);
		System.out.println(i instanceof Number);
		System.out.println(i instanceof Object);
		
		System.out.println(null instanceof Integer);
		System.out.println(null instanceof Number);
		
	}

}
