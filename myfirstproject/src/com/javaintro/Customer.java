package com.javaintro;

public class Customer extends Object{
	@Override
	protected void finalize() throws Throwable {
	System.out.println("finalise method called");
	}
	public static void main(String[] args) {
		System.out.println("Main method startded");
		Customer c1 = new Customer();
		System.out.println(c1);//Adress of the object
		Customer c2 = new Customer();
		System.out.println(c2);//7ad041f3
		Customer c3 = new Customer();
		System.out.println(c3);//251a69d7
		c1 = null;
		c2 = null;
		c3 = null;
		System.gc();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		int i1 = 0x1dbd16a6;
//		System.out.println(i1);
//		System.out.println(c1.hashCode());
		
	
	}

}
