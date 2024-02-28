package com.java.Arrays;

public class MaxElement {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 66, 90 };

		System.out.println(max(arr));
		System.out.println(maxRange(arr, 1, 3));
		
	}

	static int max(int[] arr) {
		if(arr.length==0) {
			return -1;
		}
		int maxValue=arr[0];
		for(int i=1 ; i< arr.length;i++) {
			if(arr[i]> maxValue) {
				maxValue=arr[i];
			}
			
		}
		return maxValue;
	}
	
	// To find in range

	static int maxRange(int[] arr, int start ,int end) {
		if(end>start) {
			return -1;
		}
		if(arr==null) {
			return -1;
			
		}
		int maxValue=arr[start];
		for(int i=1 ; i<=end;i++) {
			if(arr[i]> maxValue) {
				maxValue=arr[i];
			}
			
		}
		return maxValue;
	}

}
