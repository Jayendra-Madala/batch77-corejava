package com.oops;

public class TestInhDemo1 {
	
	String name = "test";
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
	
	@Override
	public String toString() {
		return "TestInhDemo1 [name = " + name + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		TestInhDemo1 t1 = new TestInhDemo1();
		TestInhDemo1 t2 = new TestInhDemo1();
		TestInhDemo1 t3 = new TestInhDemo1();
		t3 = t2;
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t3));
		
		System.out.println(t1);
		System.out.println(t1.hashCode());
		
		System.gc();
		System.out.println("Main method ended");
	}

}
