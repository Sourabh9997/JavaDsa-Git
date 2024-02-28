package com.java.Basicprograms;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter fruit name");
		String fruit = s.next();
		int day = s.nextInt();

		switch (fruit) {
		case "mango":
			System.out.println("AAM");
			break;

		case "apple":
			System.out.println("Seb");
			break;

		case "guava":
			System.out.println("Amrud");
			break;

		default:

			System.out.println("Apna kaam kr");

		}
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday");
			break;
		case 6:
		case 7:
			System.out.println("Weekend ,Mzze kr");

		}
	}

}
