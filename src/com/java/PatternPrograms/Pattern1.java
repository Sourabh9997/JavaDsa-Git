package com.java.PatternPrograms;

public class Pattern1 {
	public static void main(String[] args) {
		pattern(4);
		
	}
	
	static void pattern(int n) {
		for (int row=1;row<=n;row++) {
			for(int col=1;col<= row;col++) {
				System.out.print("*");
			}
			// To get next line,When one row is printed
			System.out.println();
		}
	}

}
