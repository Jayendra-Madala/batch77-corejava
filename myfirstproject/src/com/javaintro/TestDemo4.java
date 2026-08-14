package com.javaintro;

public class TestDemo4 {
	int jerseyNumber;
	String name;
	
	static int countryId = 14;
	static String countryName = "India";
	
	
	public static void main(String[] args) {
		System.out.println("Country id : "+countryId);
		System.out.println("Country name : "+countryName);
		
		System.out.println("object  1 info :  --------");
		TestDemo4 virat= new TestDemo4();
		virat.jerseyNumber = 18;
		virat.name = "king";
		System.out.println("Jersey number : "+virat.jerseyNumber);
		System.out.println("Name : "+virat.name);
		
		
		
		System.out.println("object 2 info : ------------");
		TestDemo4 hitman = new TestDemo4();
		hitman.jerseyNumber = 45;
		hitman.name = "rohit";
		System.out.println("Jersey number : "+hitman.jerseyNumber);
		System.out.println("Name : "+hitman.name);
		System.out.println("Country id : "+countryId);
		System.out.println("Country name : "+countryName);
		
		
		
		
		System.out.println("object 3 info : ------------");
		TestDemo4 kl = new TestDemo4();
		kl.jerseyNumber = 1;
		kl.name = "rahul";
		kl.countryId = 12;
		kl.countryName = "zim";
		System.out.println("Jersey number : "+kl.jerseyNumber);
		System.out.println("Name : "+kl.name);
		System.out.println("Country id : "+countryId);
		System.out.println("Country name : "+countryName);
		
		
		
		System.out.println("object 4 info : ------------");
		TestDemo4 pandya = new TestDemo4();

		int jerseyNumber = 12;
		String name = "hardik";
		pandya.countryId = 12;
		pandya.countryName = "Ind";
		System.out.println("Number : "+jerseyNumber);
		System.out.println("Name : "+name);
		System.out.println("Country id : "+countryId);
		System.out.println("Country name : "+countryName);
		
	
		
	}

}
