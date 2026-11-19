package com.oops.abstracation;

public class Dog implements Animal{
	@Override	
	public void sleep() {
			System.out.println("Dogs can sleep only at night");
		}
		public void sound() {
			System.out.println("Dog makes sound bow bow");
		}
		
		public void eat() {
			System.out.println("Dog eats non veg");
		}
		
		public void walk() {
			System.out.println("Dog mostly runs !!");
		}

}
