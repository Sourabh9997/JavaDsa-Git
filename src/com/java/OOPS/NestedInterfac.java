package com.java.OOPS;

public class NestedInterfac {
	/*
	 * 
	 * 
	 * An interface, i.e., declared within another interface or class, is known as a
	 * nested interface. The nested interfaces are used to group related interfaces
	 * so that they can be easy to maintain. The nested interface must be referred
	 * to by the outer interface or class. It can't be accessed directly.
	 * 
	 * 
	 * The nested interface must be public if it is declared inside the interface,
	 * but it can have any access modifier if declared within the class. Nested
	 * interfaces are declared static
	 * 
	 * 
	 */

	/*
	 * interface Showable{ void show(); interface Message{ void msg(); } } class
	 * TestNestedInterface1 implements Showable.Message{ public void
	 * msg(){System.out.println("Hello nested interface");}
	 * 
	 * public static void main(String args[]){ Showable.Message message=new
	 * TestNestedInterface1();//upcasting here message.msg(); } }
	 */

	/*
	 * 
	 * As you can see in the above example, we are accessing the Message interface
	 * by its outer interface Showable because it cannot be accessed directly. It is
	 * just like the almirah inside the room; we cannot access the almirah directly
	 * because we must enter the room first. In the collection framework, the sun
	 * microsystem has provided a nested interface Entry. Entry is the subinterface
	 * of Map, i.e., accessed by Map.Entry.
	 * 
	 */
}
