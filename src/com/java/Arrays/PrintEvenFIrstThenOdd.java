package com.java.Arrays;

public class PrintEvenFIrstThenOdd {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] a = new int[arr.length];
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				a[index]=arr[i];
				index++;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				a[index]=arr[i];
				index++;
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("New Array " + a[i]);
		}
		
		
	}

}
