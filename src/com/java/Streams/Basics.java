package com.java.Streams;

import java.util.*;
import java.util.stream.Collectors;
public class Basics {
public static void main(String[] args) {
	List<String> numbers=Arrays.asList("1","2","3","4");
	
	String results=String.join("-", numbers);
	System.out.println(results);
	
	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
	list.stream().map(x->x*2).collect(Collectors.toList());
	
	String[] array= {"c" ,"l","c","s","c","s","d","a"};
	List<String> mylist=Arrays.asList(array);
	List<String> mylist2=mylist.stream().distinct().collect(Collectors.toList());
	System.out.println(mylist2);
	
}
}
