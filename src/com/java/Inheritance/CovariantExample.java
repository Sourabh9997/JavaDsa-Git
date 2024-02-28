package com.java.Inheritance;

class A1 {
	A1 foo() {
		return this;
	}

	void print() {
		System.out.println("Inside the class A1");
	}
}

// A2 is the child class of A1  
class A2 extends A1 {
	@Override
	A1 foo() {
		return this;
	}

	void print() {
		System.out.println("Inside the class A2");
	}
}

// A3 is the child class of A2  
class A3 extends A2 {
	@Override
	A1 foo() {
		return this;
	}

	@Override
	void print() {
		System.out.println("Inside the class A3");
	}
}

public class CovariantExample {

	public static void main(String argvs[]) {
		A1 a1 = new A1();

		// this is ok
		a1.foo().print();

		A2 a2 = new A2();

		// we need to do the type casting to make it
		// more clear to reader about the kind of object created
		((A2) a2.foo()).print();

		A3 a3 = new A3();

		// doing the type casting
		((A3) a3.foo()).print();

	}

}

/*
 * 
 * class A3 inherits class A2, and class A2 inherits class A1. Thus, A1 is the
 * parent of classes A2 and A3. Hence, any object of classes A2 and A3 is also
 * of type A1. As the return type of the method foo() is the same in every
 * class, we do not know the exact type of object the method is actually
 * returning. We can only deduce that returned object will be of type A1, which
 * is the most generic class. We can not say for sure that returned object will
 * be of A2 or A3. It is where we need to do the typecasting to find out the
 * specific type of object returned from the method foo(). It not only makes the
 * code verbose; it also requires precision from the programmer to ensure that
 * typecasting is done properly; otherwise, there are fair chances of getting
 * the ClassCastException. To exacerbate it, think of a situation where the
 * hierarchical structure goes down to 10 - 15 classes or even more, and in each
 * class, the method foo() has the same return type. That is enough to give a
 * nightmare to the reader and writer of the code.
 * 
 * 
 * The covariant return type specifies that the return type may vary in the same
 * direction as the subclass.
 * 
 * Before Java5, it was not possible to override any method by changing the
 * return type. But now, since Java5, it is possible to override method by
 * changing the return type if subclass overrides any method whose return type
 * is Non-Primitive but it changes its return type to subclass type. Let's take
 * a simple example:
 * 
 * 
 */
