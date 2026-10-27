package com.starPatterns;

public class TestPatternsDemo9 {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j);
			}
			for(int j = i ; j<5 ; j++) {
				System.out.print(" ");
			}
			for(int k = i;k < 5  ; k++) {
				System.out.print(" ");
			}
			for(int l = 1 ; l <= i ; l++) {
									
				
				System.out.print(l);
			}
			System.out.println();
		}
		
		for(int i = 1 ; i <=4 ; i++) {
			for(int j = i ; j <=4 ; j++) {
				System.out.print(j);
			}
			for(int k =1 ; k <= i ; k++) {
				System.out.print(" ");
			}
		
			for(int l = 1 ; l<= i;l++  ) {
				System.out.print(" ");
			}
			for(int m = i ; m <= 4 ; m++) {
				System.out.print(m);
			}
			
			System.out.println();
			
		}
	
	}
}