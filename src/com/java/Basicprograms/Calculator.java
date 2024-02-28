package com.java.Basicprograms;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Take input from User,Jabtk wo x ya X na dabade

		int ans = 0;
		while (true) {
			// Take operator as input
			System.out.print("Enter the operation you want to perform : ");
			char op = s.next().trim().charAt(0);
			if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				// Input two numbers
				System.out.print("Enter 2 numbers, Buddy : ");
				int num1 = s.nextInt();
				int num2 = s.nextInt();

				if (op == '+') {
					ans = num1 + num2;
				}
				if (op == '-') {
					ans = num1 - num2;
				}
				if (op == '*') {
					ans = num1 * num2;
				}
				if (op == '%') {
					ans = num1 % num2;
				}
				if (op == '/') {
					if (num2 != 0) {
						ans = num1 / num2;
					}

				} 

			}else if (op == 'x' || op == 'X') {
				break;
			} else {
				System.out.println("Invalid Operation buddy");
			}
			System.out.println(ans);
		}
	}

}
