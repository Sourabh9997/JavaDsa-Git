package com.java.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringOperationsUsingStreams {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(" Sourabh","Nikkis","Ram");
		
		//Longest String
		
		String longest=list.stream().reduce((list1,list2)->list1.length()>list2.length()?list1:list2).get();
		System.out.println("Longest String is " + longest);
		
		Map<Integer,String > map=new HashMap<Integer, String>();
		map.put(1, "Sourabh");
		map.put(2, "Shubhm");
		// Traverse map
		map.forEach((key,value)->System.out.println(key + " " + value));
		
		// Using Stream
		
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		System.out.println("Now Sorting operations");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(obj->System.out.println(obj));
		
		
		//Some more
		System.out.println(" Yha dekh");
		List<String> abc=new ArrayList<>();
		abc.add("Niks");
		abc.add("Love");
		
		abc.stream().filter(s->s.startsWith("L")).forEach(obj->System.out.println(obj));
	}

}
