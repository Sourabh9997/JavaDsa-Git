package com.java.Arrays;

import java.util.Scanner;

public class CreateArrayByTakingIp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		
		int size=sc.nextInt();
		
		int[] array=new int[size];
		for (int i=0;i<size;i++) {
			System.out.println("Enter the element");
			array[i]=sc.nextInt();
			
		}
		System.out.println("printing elements of array");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
	
		

	}

	}}
