package com.oops.abstracation;

public class Cat implements Animal{

		@Override
		public void sound() {
			
		System.out.println("Cat can sounds like meow meow !!");
	}
		@Override
		public void eat() {
			System.out.println("Cat eats curd rice");
		}
		@Override
		public void walk() {
			System.out.println("Cat walks with 4 legs");
		}
}
