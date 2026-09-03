package com.langfundamentals.methods;

import java.util.*;

public class Customer1 {
	int cid;
	String name;
	
	Customer1(){
		System.out.println("No arg constructor called");
		cid = 19;
		name= "Unknown";
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		 Scanner sc = new Scanner(System.in);
		Customer1 c1 = new Customer1();
		System.out.println(c1.name);
		System.out.println(c1.cid);
		
		Customer1 c = new Customer1();
		System.out.println(c.name);
		System.out.println(c.cid);
		System.out.println("Main method ended");
		
		c1.show();
		c.show();
	}

	void show() {
		System.out.println("Customer id is : " + cid);
		System.out.println("Customer name is : " + name);
	}
}
