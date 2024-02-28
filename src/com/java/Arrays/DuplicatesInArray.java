package com.java.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,2,4,5,3};
		HashSet<Integer> set1=new HashSet<>();
		HashSet<Integer> duplicate=new HashSet<>();
		
		for (Integer integer : a) {
			if(!(set1.contains(integer))) {
				set1.add(integer);
				
			}else {
				duplicate.add(integer);
			}
			
		}
		System.out.println(duplicate);
		
		// Problem 2
		
		String [] duplicates= new String[]{"java","abc","java"};
		List list=Arrays.asList(duplicates);
		Set set=new HashSet<>(list);
		
		if(list.size() != set.size()) {
			System.out.println("Duplicates found");
		}else
			System.out.println("Duplicate are there");
		
		//Third way
		
		int[] myarray= {1,3,4,5,2,3,6,7,6,8,9,8};
		Set myset=new HashSet();
		
		for(int i=0;i<myarray.length;i++) {
			if(myset.contains(myarray[i]))
			{
				System.out.println("DuplicATE ELEMENT MIL GYE" + myarray[i]);
				
			}else
				myset.add(myarray[i]);
		}
			
	}
	
	
	

	
}
