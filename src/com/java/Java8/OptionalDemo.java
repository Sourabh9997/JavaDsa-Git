package com.java.Java8;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		String[] words = new String[10];
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		if (checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("word is null");
	}

	/*
	 * Java introduced a new class Optional in jdk8. It is a public final class and
	 * used to deal with NullPointerException in Java application. You must import
	 * java.util package to use this class. It provides methods which are used to
	 * check the presence of value for particular variable.
	 * 
	 * 
	 */
}
