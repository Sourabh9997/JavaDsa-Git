package com.java.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreOperations {

	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		int max = myList.stream().max(Integer::compare).get();
		System.out.println(max);
		// First non repeated element

		System.out.println("********************* FIRST NON repeated");
		String input = "Java articles are Awesome";
		// System.out.println(Arrays.asList(input));
		List<String> list = Arrays.asList(input);
		System.out.println(list);

		Character result = input.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object
																					// and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store
																												// the
																												// chars
																												// in
																												// map
																												// with
																												// count
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(result);

		// First repeated
		String input1 = "Java Articles are Awesome";

		Character result1 = input1.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object
																					// and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store
																												// the
																												// chars
																												// in
																												// map
																												// with
																												// count
				.entrySet().stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(result1);

		System.out.println("Current Local Date: " + java.time.LocalDate.now());
		// Used LocalDate API to get the date
		System.out.println("Current Local Time: " + java.time.LocalTime.now());
		// Used LocalTime API to get the time
		System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
		// Used LocalDateTime API to get both date and time

		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");

		Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
		// concatStream.forEach(str -&gt ,System.out.print(str + " "));
		// Concatenated the list1 and list2 by converting them into Stream

		// System.out.println(concatStream);

		// Printed the Concatenated Stream

		List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
		System.out.println("List of strings: " + colors);
		// Convert strings to uppercase using streams
		List<String> uppercaseStrings = colors.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("\nUppercase Strings: " + uppercaseStrings);

		// Convert strings to lowercase using streams
		List<String> lowercaseStrings = colors.stream().map(String::toLowerCase).collect(Collectors.toList());

		System.out.println("Lowercase Strings: " + lowercaseStrings);

		// Max
		List<Integer> myList10 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		int max10 = myList10.stream().max(Integer::compare).get();
		System.out.println(max10);
		
		//List of list
		System.out.println(" CODE of Flatmap");
		
		  List<List<Integer> > number = new ArrayList<>();
	       
	        // adding the elements to number arraylist
	        number.add(Arrays.asList(1, 2));
	        number.add(Arrays.asList(3, 4));
	        number.add(Arrays.asList(5, 6));
	        number.add(Arrays.asList(7, 8));
	       
	        System.out.println("List of list-" + number);
	        List<Integer> flatList
            = number.stream()
                  .flatMap(l -> l.stream())
                  .collect(Collectors.toList());
       
        // printing the list
        System.out.println("List generate by flatMap-"
                           + flatList);
        
        

        // Converting String array to stream 
        String[] arr = { "Geeks", "for", "Geeks" }; 
  
        // Using Arrays.stream to convert an 
        // array into Stream 
        Stream<String> stm = Arrays.stream(arr); 
  
        // Displaying elements in Stream 
        stm.forEach(str -> System.out.print(str + " "));
        
        //10 ways to create stream----->> 1- Using Collection, 2- Stream.of()
        // 3- Arrays.stream()
        //4-- Stream.empty()---- to make empty stream
        
        //5 Using stream.builder
        //6 Infinite stream-- Using Stream.iterate()
//7
    //    Stream.generate(null)--- Infinite stream
        
        
	}

}
