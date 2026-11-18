package com.oops;

public class TestPolyDemo5 {

	public  void main(String[] args) {
		System.out.println("Main method started");
		
		System.out.println("Area of Triangle is : " + findArea(2.3,4.5));
		
		System.out.println("Area of Square is : " + findArea(4));

		System.out.println("Area of Rectangle is : " + findArea(3.3,4.6));
		
		System.out.println("Area of Circle is : " + findArea(3.3));
		
		
		
		System.out.println("Main method ended");
		
	}
	
	double findArea(double base , double height) {
		return 0.5 * base * height;
	}

	double findArea(double side) {
		return side * side;
	}
	

	double findArea(float length , double breadth) {
		return length * breadth;
	}
	

	double findArea(float radius ) {
		return Math.PI * radius * radius;
	}




	

}
