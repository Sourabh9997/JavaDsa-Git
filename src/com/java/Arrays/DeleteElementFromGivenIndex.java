package com.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DeleteElementFromGivenIndex {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Original one " + Arrays.toString(arr));

		int index = 4;
		int[] newarr = IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr[i]).toArray();

		System.out.println("new one " + Arrays.toString(newarr));
		
		// Using collection
		
		String[] string= {"red","blue","green"};
		List<String> newList=new ArrayList(Arrays.asList(string));
		newList.remove(1);
		System.out.println(newList);
		
		// Basic way
		
		int arr2[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Original two " + Arrays.toString(arr));
		int[] arr3=new int[arr2.length-1];
		int index2=2;
		for(int i=0,k=0;i<arr2.length;i++) {
			if(i==index2) {
				continue;
			}
			arr3[k++]=arr2[i];
			
		}
		System.out.println("FInal " + Arrays.toString(arr3));
		
	}

}
