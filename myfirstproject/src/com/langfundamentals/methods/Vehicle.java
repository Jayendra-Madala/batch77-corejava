package com.langfundamentals.methods;

public class Vehicle {
	

	String model;
	String brand;
	double price;
	
	Vehicle(String model,String brand,double price){
		System.out.println("Three arg parameterised constructor called");
		Vehicle v1 = new Vehicle();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	Vehicle(){
		System.out.println("No arg constructor called from vehicle");
		
	}
	

	
	
	
	public static void main(String[] args) {
		
		System.out.println("Main method started from vehicle");
	}

}

class Auto extends Vehicle{
	
	Auto(String model, String brand , double price){
		super.model = model;
		super.brand = brand;
		super.price = price;
	}
	Auto(){
		super("harrier","tata",1230000);
		System.out.println("Car constructor called");
	}
	public static void main(String args[]) {
		System.out.println("Main method started from Car");
		Auto c1 = new Auto();
		c1.carInfo();
		
		Auto c2 = new Auto("Nexon","Tata",120000);
		c2.carInfo();
		
	}
	void carInfo() {
		System.out.println("Model of the car is : " +model);
		System.out.println("Brand of the car is : " + brand);
		System.out.println("Price of the car is : " + price);
		
	}
}
