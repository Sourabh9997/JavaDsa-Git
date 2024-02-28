package com.java.Basicprograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number upto which , You want Fibo series");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	int count=2;
	while(count<=n) {
		int c=b;
		b=b+a;
		a=c;
		count++;
	}
	System.out.println(b);
	}

}
