package com.java.Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class AddSumAndReverseArray {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size");
		int size = sc.nextInt();

		int array[] = new int[size];
		System.out.println("Enter elements");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Printing sum");

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);

	}

	// Reverse logic

	

}
