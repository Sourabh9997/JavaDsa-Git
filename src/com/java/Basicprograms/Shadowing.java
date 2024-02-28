package com.java.Basicprograms;

public class Shadowing {
	static int x=10;  // this wiil be shadowed at line 8
	
public static void main(String[] args) {
	System.out.println(x); //10
	int x;
	//System.out.println(x); // Scope will begin when the value is initialized
	x=40;
	System.out.println(x); //40
	
	fun();
}
static void fun() {
	System.out.println(x); //10
}
}
