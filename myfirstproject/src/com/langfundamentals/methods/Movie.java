package com.langfundamentals.methods;

public class Movie {
	
	String director;
	String producer;
	String hero;
	String heroine;
	String nameOfMovie;
	double budget;
	
	public Movie() {
		System.out.println("NO arg constructor called");
	}
	
	
	
	public Movie(String director , String producer) {
		this.director = director;
		this.producer = producer;
	}
	
	public Movie( Movie m1 , String hero ) {
		this.hero = hero;
		this.director = m1.director;
		this.producer = m1.producer;
	}
	
	public Movie(Movie m2 , String heroine , String nameOfMovie , double budget) {
		this.hero = m2.hero;
		this.heroine = heroine ;
		this.producer = m2.producer;
		this.director = m2.director;
		this.budget = budget;
		this.nameOfMovie = nameOfMovie;
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Movie m = new Movie();
		m.movieInfo();
		
		Movie m1 = new Movie(" S S Rajamouli","Mythri movie makers" );
		m1.movieInfo();
		
		Movie m2 = new Movie(m1,"Mahesh Babu");
		m2.movieInfo();
		
		Movie m3 = new Movie(m2 , "Priyanka Chopra" , "Varanasi" , 5000000000.0);
		m3.movieInfo();
	}
	
	void movieInfo() {
	System.out.println("Director of the movie is : " + director);
	System.out.println("Producer of the movie is :  " + producer);
	System.out.println("Hero of the movie is :  " + hero);
	System.out.println("Heroine  of the movie is :  " + heroine);
	System.out.println("Name  of the movie is :  " + nameOfMovie);
	System.out.println("Budget of the movie is :  " + budget);
	
	}
}
