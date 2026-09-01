package com.langfundamentals.methods;

import java.util.*;

public class Areas {

	 void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value : ");
		double base = sc.nextDouble();
		System.out.println("Enter the height value : ");
		double height = sc.nextDouble();
		
		System.out.println("Enter the len value : ");
		double len = sc.nextDouble();
		System.out.println("Enter the bread value : ");
		double bread = sc.nextDouble();
		
		
		System.out.println("Enter the side value : ");
		double side = sc.nextDouble();
		
		double at = areaOfTriangle(base,height);
		
		double ar = areaOfRectangle(len,bread);
		
		double as = areaOfSquare(side);
		
		System.out.println("Area of triangle is :"+at);
		System.out.println("Area of rectangle is :"+ar);
		System.out.println("Area of square is :"+as);
		System.out.println("Main method ended");
	}
	double areaOfTriangle(double base,double height) {
		double area = 0.5 * base * height;
		return area;
	}
	
	double areaOfRectangle(double len , double bread) {
		double ar = len * bread;
		return ar;
	}
	double areaOfSquare(double side) {
		double as = side * side;
		return as;
	}
	
	double areaOfCircle(double rad) {
		return Math.PI * rad * rad;
	}
}
