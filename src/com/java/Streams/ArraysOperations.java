package com.java.Streams;

import java.util.Arrays;

public class ArraysOperations {
	public static void main(String[] args) {
		
		//Common Elements in 2 arrays
		
		int[] arr1= {1,2,3,4,5,6,7};
		int [] arr2= {2,3,5,6};
		

		System.out.println("Using Streams");
		
		Arrays.stream(arr1).filter(x->Arrays.stream(arr2).anyMatch(y->y==x)).distinct().forEach(System.out::println);
	
		
	}
}
