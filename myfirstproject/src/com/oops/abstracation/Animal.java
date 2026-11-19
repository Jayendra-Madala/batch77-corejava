package com.oops.abstracation;

public abstract interface Animal {
	
	public abstract void sound(); 
	
	public abstract void eat();
	
	public abstract void walk();
	//default methods help us to avoid backward - compatibility problems
	//Can we override default methds? - Yes
	default void sleep() {
		System.out.println("Animals can sleep");
	}
	
	default void run() {
		System.out.println("Some  animals run");
	}
	//Private methods are introduced in java to stop overriding process
	private void hello() {
		System.out.println("Hello !!");
	}
	
	public static void breath() {
		System.out.println("Animals must breath!!!");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		
		
		System.out.println("Main method ended");

	}
}
