package com.javaintro;

public class Laptop {
	String name = "HP Victus";
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Final method called");
	}
	void m1() {
		System.out.println("m1 called");
		Laptop l2 = new Laptop();
		System.out.println(name);
	}
	public static void main(String[] args) {
		System.out.println("main method called");
		Laptop l1 = new Laptop();
		System.out.println(l1);
		Laptop l2 = new Laptop();
		System.out.println(l2);
		l2 = null;
		l2 = l1;
		System.gc();
		new Laptop().m1();
		System.out.println(l1);
		System.out.println(l2);
	}

}
