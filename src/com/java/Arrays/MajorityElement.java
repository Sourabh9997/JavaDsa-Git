package com.java.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static void main(String[] args) {
		int [] arr= {10,20,10,10,20,10};
		
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>arr.length/2) {
				int result=entry.getKey();
				System.out.println(result);
			}
			
		}
			
	}
}
