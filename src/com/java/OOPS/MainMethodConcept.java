package com.java.OOPS;

public class MainMethodConcept {
	// Overloaded main() method
	public static void main() {
		System.out.println("Overloaded main() method called");
	}

	// Original main() method
	public static void main(String args[]) {
		System.out.println("Original main() method called");
	}
}
/*
 * The short answer to, can we overload main method in Java is Yes, we can
 * overload the main() method in Java. A Java class can have any number of
 * overloaded main() methods. But the very first thing JVM (Java Virtual
 * Machine) seeks is the original main() method, i.e., public static void
 * main(String[] args) to execute. The class will compile but won't run without
 * the original main() method.
 * 
 * The main method is a special method in Java that acts as an entry point for
 * running any Java program. It always has the same syntax, i.e., public static
 * void main (String[] args). One can only change the name of the String array
 * argument, for example, args as str.
 * 
 * As JVM starts its execution by invoking the main method of the class, so, it
 * must have an exact signature as mentioned above. The following methods are
 * overloaded main method:
 * 
 * Explanation: As we can see in the above example, JVM executes only the
 * original main() method by default and not the overloaded main() method. As a
 * result, we must call the overloaded main methods from the original main
 * method to execute them, which has been discussed in the later half of the
 * article.
 */