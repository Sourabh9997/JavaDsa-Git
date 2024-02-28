package com.java.Basicprograms;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter No");
		int n=s.nextInt();
		
		System.out.println(isPrime(n));

	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		if(c*c>n) {
			return true;
		}
		return false;
	}

}
