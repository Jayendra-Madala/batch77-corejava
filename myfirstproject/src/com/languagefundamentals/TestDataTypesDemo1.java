package com.languagefundamentals;

public class TestDataTypesDemo1 {
	
	byte b = 123;
	byte b1 = (byte)256;
	
	
	short s = 32727;
	short s1 =(short) 40000;
	
	int i = 2147483647;
	
	
	long l = 9223372036854775807L;
	long phno = 8309893780L;
	int phno1 = (int) phno;
	long l1 = i;
	
	char c;
	boolean boo;
	
	
	float f = 5.9f;
	double d = 12.987;
	
	
	public static void main(String[] args) {

		System.out.println("Main method started");
		
		TestDataTypesDemo1 t = new TestDataTypesDemo1();
		
		System.out.println("byte value : " + t.b);
		System.out.println(t.b1);
		System.out.println("short value : " + t.s);
		System.out.println("int value : " + t.i);
		System.out.println("long value : " + t.l);
		
		
		System.out.println("character value : " +t.c);
		System.out.println("boolean value : " + t.boo);
		
		
		System.out.println("float value : " + t.f);
		System.out.println("double value : " + t.d);
		
		
		
		
		System.out.println("Main method ended");
	}

}
