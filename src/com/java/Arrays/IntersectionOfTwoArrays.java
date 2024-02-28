package com.java.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7};
		int [] arr2= {2,3,5,6};
		
		intersection(arr1,arr2);
	}
	static void intersection(int[] arr1,int[] arr2) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
		if(set.contains(arr1[i])) {
			System.out.println("Common Elements " + arr2[i]);
		}
		}
		
		
		System.out.println("Using Streams");
		
		Arrays.stream(arr1).filter(x->Arrays.stream(arr2).anyMatch(y->y==x)).distinct().forEach(System.out::println);
	}

}
