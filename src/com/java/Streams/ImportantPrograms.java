package com.java.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ImportantPrograms {

	public static void main(String[] args) {
		String input = "ILoveSourabhSingh";
		String[] array = input.split("");
		System.out.println(Arrays.toString(array));
		System.out.println("****************************************** Very Imp ,Pay attention");
		List<String> list2 = Arrays.asList(array);
		System.out.println(list2);
		Set<String> set3 = list2.stream().filter(e -> Collections.frequency(list2, e) > 1).collect(Collectors.toSet());
		System.out.println(set3);

		System.out.println("7&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		// Important programs Question 2

		Map<String, Long> elementcount = list2.stream()
				.collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
		// I will use this method-------->>>>

		Map<String, Long> elementcount2 = list2.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(" No of count of every character is " + elementcount);

		System.out.println(" No of count of every character is by new method" + elementcount2);
		
		// New Problem
		
		List<String> names = Arrays.asList("AA", "BB", "AA", "DD", "CC", "DD");
		Map<String, Long> ginti = names.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));

		System.out.println(ginti);

		// Grouping words by their length
		

		List<String> words = Arrays.asList("i", "have", "two", "siblings", "b", "why");
		Map<Integer, List<String>> mappy = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(mappy);

		String word = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println("Longest word " + word);
		
		List<String> hato=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(hato);
	}

}
