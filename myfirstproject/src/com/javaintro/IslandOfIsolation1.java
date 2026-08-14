package com.javaintro;
class A{
	B b;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called from A");
	}
}
class B{
	A a;
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called from B");
	}
}
public class IslandOfIsolation1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		A obj1 = new A();
		B obj2 = new B();
		obj1.b = obj2;
		obj2.a = obj1;
		System.gc();
		obj1 = null;
		obj2 = null;
		System.out.println("Main method ended");
	}

}
