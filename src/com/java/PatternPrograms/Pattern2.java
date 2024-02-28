package com.java.PatternPrograms;

public class Pattern2 {

	public static void main(String[] args) {
		pattern7(5);

	}

	static void pattern2(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Pattern3

	static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	// Important pattern

	static void pattern5(int n) {

		for (int row = 0; row < 2 * n; row++) {
			int totalColsInRow = row > n ? 2 * n - row : row;
			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Diamond Pattern

	static void pattern6(int n) {

		for (int row = 0; row < 2 * n; row++) {
			int totalColsInRow = row > n ? 2 * n - row : row;
			int noOfSpaces = n - totalColsInRow;
			for (int s = 0; s < noOfSpaces; s++) {
				System.out.print(" ");
			}
			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// New Pattern

	static void pattern7(int n) {

		for (int row = 1; row <= n; row++) {
		
		
			for (int space = 0; space < n-row; space++) {
				System.out.print(" ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col);
			}
			for (int col =2; col <=row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	
	}
}
