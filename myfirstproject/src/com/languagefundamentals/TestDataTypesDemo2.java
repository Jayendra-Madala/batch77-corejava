package com.languagefundamentals;
import java.math.BigInteger;
import java.math.BigDecimal;

class Dog{
	
}

public class TestDataTypesDemo2 {
	
	
	String s = "Jayendra is student of java";
	String s1 = new String("Full stack developer");
	BigInteger bi = new BigInteger("1234556778889");
	BigInteger bi2 = new BigInteger("676445664566");

	BigDecimal bd;
	
	Integer i;
	Short sh;
	Character c;
	
	Dog d = new Dog();
	
	
	public static void main(String[] args) {
		TestDataTypesDemo2 obj = new TestDataTypesDemo2();
		
		
		System.out.println("String is : " + obj.s);
		System.out.println("String 1 is : " + obj.s1);
		System.out.println(obj.bi.add(obj.bi2));
		
		
		System.out.println("BigInteger is : " + obj.bi);
		System.out.println("BigDecimal is : " + obj.bd);
		System.out.println("Integer is : " + obj.i);
		System.out.println("Short is : " + obj.sh);
		System.out.println("Character is : " + obj.c);
		System.out.println("Dog is : " + obj.d);
	}

}
