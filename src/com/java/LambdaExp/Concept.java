package com.java.LambdaExp;

interface Drawable {
	public void draw();
}

public class Concept {
// Without Lambda exp

	public static void main(String[] args) {
		int width = 10;

		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();
	}

	/*
	 * Java lambda expression is consisted of three components.
	 * 
	 * 1) Argument-list: It can be empty or non-empty as well.
	 * 
	 * 2) Arrow-token: It is used to link arguments-list and body of expression.
	 * 
	 * 3) Body: It contains expressions and statements for lambda expression.
	 * 
	 * 
	 * 
	 */
	
	/*
	 * Java Lambda Expression Example: No Parameter
interface Sayable{  
    public String say();  
}  
public class LambdaExpressionExample3{  
public static void main(String[] args) {  
    Sayable s=()->{  
        return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}  
	 * 
	 * 
	 * 
	 * Java Lambda Expression Example: Single Parameter
	 * 
	 * interface Sayable{  
    public String say(String name);  
}  
  
public class LambdaExpressionExample4{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
        Sayable s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        Sayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo"));  
    }  
}  
	 * 
	 * 
	 * Java Lambda Expression Example: Multiple Parameters
interface Addable{  
    int add(int a,int b);  
}  
  
public class LambdaExpressionExample5{  
    public static void main(String[] args) {  
          
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(100,200));  
    }  
}  
	 * 
	 * 
	 * interface Addable{  
    int add(int a,int b);  
}  
  Java Lambda Expression Example: with or without return keyword
  
  
  
public class LambdaExpressionExample6 {  
    public static void main(String[] args) {  
          
        // Lambda expression without return keyword.  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad2.add(100,200));  
    }  
}  
	 * 
	 * Most imp
	 * 
	 * 
	 * Java Lambda Expression Example: Creating Thread
You can use lambda expression to run thread. In the following example, we are implementing run method by using lambda expression.

public class LambdaExpressionExample9{  
    public static void main(String[] args) {  
      
        //Thread Example without lambda  
        Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("Thread1 is running...");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();  
        //Thread Example with lambda  
        Runnable r2=()->{  
                System.out.println("Thread2 is running...");  
        };  
        Thread t2=new Thread(r2);  
        t2.start();  
    }  
}  
	 * 
	 * 
	 * 
	 * 
	 * import java.util.*;  
public class LambdaExpressionExample7{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  
	 * 
	 * 
	 * @FunctionalInterface  
interface Sayable{  
    String say(String message);  
}  
  
public class LambdaExpressionExample8{  
    public static void main(String[] args) {  
      
        // You can pass multiple statements in lambda expression  
        Sayable person = (message)-> {  
            String str1 = "I would like to say, ";  
            String str2 = str1 + message;   
            return str2;  
        };  
            System.out.println(person.say("time is precious."));  
    }  
}  
	 * 
	 * 
	 */

}
// Now after lambda exp--Less coding,

/*
 * @FunctionalInterface //It is optional interface Drawable{ public void draw();
 * }
 * 
 * public class LambdaExpressionExample2 { public static void main(String[]
 * args) { int width=10;
 * 
 * //with lambda Drawable d2=()->{ System.out.println("Drawing "+width); };
 * d2.draw(); } }
 */