package com.java.Streams;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class NormalOperations {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 12, 22, 222, 32, 44, 221, 3, 2, 12, 3, 2);
		String input="ILoveSourabhSingh";
		String[] array=input.split("");
		System.out.println(Arrays.toString(array));
		System.out.println("****************************************** Very Imp ,Pay attention");
		List<String > list2=Arrays.asList(array);
		System.out.println(list2);
		Set<String> set3 = list2.stream().filter(e -> Collections.frequency(list2, e) > 1).collect(Collectors.toSet());
		System.out.println(set3);
		
		System.out.println("7&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"
				);
		
		//Important programs
		
		Map<String, Long> elementcount=list2.stream().collect(Collectors.toMap(Function.identity(), v->1L,Long::sum));
		System.out.println(" No of count of every character is " +elementcount);
		

		System.out.println("starts with 2 operation");

		List<Integer> list1 = list.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
				.map(e -> Integer.valueOf(e)).collect(Collectors.toList());
		System.out.println(list1);

		// Average

		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();

		System.out.println(avg);

		// Now how to find max
		int max = list.stream().max(Comparator.comparing(e -> e)).get();
		System.out.println("Max no is = " + max);

		// Limit operation

		System.out.println("Limit operation");

		List<Integer> l = list.stream().limit(5).collect(Collectors.toList());
		System.out.println("Limit operation done " + l);

		// Sum of first five
		int add = list.stream().limit(5).reduce((a, b) -> a + b).get();
		System.out.println(add);

		// Skip

		List<Integer> l2 = list.stream().skip(5).collect(Collectors.toList());
		System.out.println("skip operation " + l2);

		// Second largest number

		int secondlargest = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst()
				.get();

		System.out.println(" SECOND LARGEST dekhle = " + secondlargest);

		// Largest
		int greatest = list.stream().sorted(Collections.reverseOrder()).distinct().findFirst().get();
		System.out.println("Greatest is " + greatest);
		
		
		// Frequency method to get duplicates
		Set<Integer> set = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
		System.out.println("Duplicates are " + set);
		// Unique elements
		Set<Integer> set1 = list.stream().filter(e -> Collections.frequency(list, e) == 1).collect(Collectors.toSet());
		System.out.println("Unique are " + set1);
		
	// Cool way to find duplicate
		          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		          Set<Integer> settting = new HashSet();
		          myList.stream()
		                .filter(n -> !set.add(n))
		                .forEach(System.out::println);
		  
		
		
	}

}
