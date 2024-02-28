package com.java.Basicprograms;

public class SwapNum {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//	int temp=a;
//	a=b;
//	b=temp;
		
		// Why is it not getting swapped bcz-- Here we passing the value of a and b not the reference of a and b-- Hence original value remains intact
		swap(a, b);
		System.out.println(a + " " + b);
		String name = "Sourabh";
		changeName(name);
		System.out.println(name);

	}

	static void changeName(String name) {
		name = "Nikki";
	}

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
