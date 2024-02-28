package com.java.Inheritance;
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  
public class SuperKeyword {
//super can be used to invoke parent class method
	/*
	 * The super keyword can also be used to invoke parent class method. It should
	 * be used if subclass contains the same method as parent class. In other words,
	 * it is used if method is overridden.
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.work();
	
}
}
/*
class Animal{  
String color="white";  
}  
class Dog extends Animal{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class TestSuper1{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}}  
*/

/*
 * 
 * 
 * 
 * 
 * class Person{  
int id;  
String name;  
Person(int id,String name){  
this.id=id;  
this.name=name;  
}  
}  
class Emp extends Person{  
float salary;  
Emp(int id,String name,float salary){  
super(id,name);//reusing parent constructor  
this.salary=salary;  
}  
void display(){System.out.println(id+" "+name+" "+salary);}  
}  
class TestSuper5{  
public static void main(String[] args){  
Emp e1=new Emp(1,"ankit",45000f);  
e1.display();  
}}  

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
 

