package com.langfundamentals.methods;

public class Bike {
	
	String model;
	String brand;
	double price;
	int year;
	String colour;
	
	Bike() {
		this("unknown","unknown");
	System.out.println("NO arguments called");	
	}

	
	public Bike(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
		
	}
	
	
	public Bike(String model, String brand, double price, int year, String colour) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.colour = colour;
	}


	public static void main(String[] args) {
		System.out.println("Welcome to v Cube car showroom");
		
		Bike unicorn = new Bike("Unicorn","Honda",1300000,2023,"black");
		unicorn.bikeInfo();
		
		Bike fz = new Bike();
		fz.bikeInfo();
		
		Bike re = new Bike("Bullet","Royal");
		re.bikeInfo();
		
	}
	

	void bikeInfo() {
		System.out.println("Model of the car is : " + model);
		System.out.println("Brand is : " + brand);
		System.out.println("Price is : " + price);
		System.out.println("Year of mannufacture is : " + year);
		System.out.println("Colour is " + colour);
		System.out.println("-------------------------------------------");

}
	
}