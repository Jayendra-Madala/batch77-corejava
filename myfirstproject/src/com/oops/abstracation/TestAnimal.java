package com.oops.abstracation;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("Welcome to animal park");
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		System.out.println("Cat information");
		// UP-Casting is the process of abstraction
		Animal c = new Cat();
		
		c.eat();
		c.walk();
		c.sound();
		c.sleep();
		
		System.out.println("Dog information");
		Animal d = new Dog();
		
		
		d.walk();
		d.eat();
		d.sound();
		d.sleep();
		d.run();
		Animal.breath();
		
		System.out.println("Monkey information");
		Animal m = new Monkey();
		
		m.walk();
		m.eat();
		m.sound();
		m.sleep();
		m.run();
		
		
	}

}
