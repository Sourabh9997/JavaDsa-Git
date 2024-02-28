package com.java.Basicprograms;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
	
		fun(1,2,3,4,5,4,5,5);
		multiple(1,2,"Sourabh","Nikki");
	}
	static void fun(int... v) {
		System.out.println(Arrays.toString(v));
		
	}
	
	static void multiple(int a, int b, String ...v) {
		System.out.println(Arrays.toString(v));
	}

}
