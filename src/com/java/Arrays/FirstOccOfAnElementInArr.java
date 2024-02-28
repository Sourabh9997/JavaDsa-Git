package com.java.Arrays;

public class FirstOccOfAnElementInArr {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,2,19,10,3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				arr[i]=arr[j];
				System.out.println(arr[i]);
				return;
				
			}
		}

	}

}
