package com.java.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// initiaze and declare
		int[][] array = new int[][] { { 1, 2, 3 }, { 2, 3, 4 }, { 5, 6, 7 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}
}

//Logic for Matrix multiplication-- c[i][j] +=a[i][k]*b[k][j]
