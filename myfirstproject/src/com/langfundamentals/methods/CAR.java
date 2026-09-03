package com.langfundamentals.methods;

public class CAR {
	String model;
	String brand;
	double price;
	int year;
	String colour;
	
	CAR(String model, String brand, double price, int year , String colour){
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.colour = colour;
	}
	
	CAR(String model,int price){
		this.model = model;
		this.price = price;
	}
	
	public static void main(String[] args) {
	
	System.out.println("Welcome to v Cube car showroom");
	
	
	CAR c  = new CAR("thar","mahindra",25,2029,"black");
	c.carInfo();
	
	CAR c2 = new CAR("Tata","harrier",170000,2030,"Black");
	c2.carInfo();
	
	CAR c3 = new CAR("Fortuner",1200000);
	c3.carInfo();
	
	}

	void carInfo() {
		System.out.println("Model of the car is : " + model);
		System.out.println("Brand is : " + brand);
		System.out.println("Price is : " + price);
		System.out.println("Year of mannufacture is : " + year);
		System.out.println("Colour is " + colour);
		System.out.println("-------------------------------------------");
		
	}

}
