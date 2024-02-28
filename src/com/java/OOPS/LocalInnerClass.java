package com.java.OOPS;

public class LocalInnerClass {
	private int data = 30;// instance variable

	void display() {
		class Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}

	/*
	 * 
	 * A class i.e., created inside a method, is called local inner class in java.
	 * Local Inner Classes are the inner classes that are defined inside a block.
	 * Generally, this block is a method body. Sometimes this block can be a for
	 * loop, or an if clause. Local Inner classes are not a member of any enclosing
	 * classes. They belong to the block they are defined within, due to which local
	 * inner classes cannot have any access modifiers associated with them. However,
	 * they can be marked as final or abstract. These classes have access to the
	 * fields of the class enclosing it.
	 * 
	 * If you want to invoke the methods of the local inner class, you must
	 * instantiate this class inside the method.
	 * 
	 * 
	 * 
	 * : Local variables can't be private, public, or protected.
	 * 
	 * Local inner class cannot be invoked from outside the method.
	 * 
	 * Local inner class cannot access non-final local variable till JDK 1.7. Since
	 * JDK 1.8, it is possible to access the non-final local variable in the local
	 * inner class.
	 * 
	 * class localInner2{  
 private int data=30;//instance variable  
 void display(){  
  int value=50;//local variable must be final till jdk 1.7 only  
  class Local{  
   void msg(){System.out.println(value);}  
  }  
  Local l=new Local();  
  l.msg();  
 }  
 public static void main(String args[]){  
  localInner2 obj=new localInner2();  
  obj.display();  
 }  
}  
	 * 
	 */
}
