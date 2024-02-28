package com.java.OOPS;

public class ThisConcept2 {
//this: to pass as argument in the constructor call
	
	/*
	 * We can pass the this keyword in the constructor also. 
	 * It is useful if we have to use one object in multiple classes. 
	 * 
	 * class B{  
  A4 obj;  
  B(A4 obj){  
    this.obj=obj;  
  }  
  void display(){  
    System.out.println(obj.data);//using data member of A4 class  
  }  
}  
  
class A4{  
  int data=10;  
  A4(){  
   B b=new B(this);  
   b.display();  
  }  
  public static void main(String args[]){  
   A4 a=new A4();  
  }  
}  
	 * 
	 * 
	 * 
	 * 
	 */
}

/*
 * 
 * We can return this keyword as an statement from the method. 
 * In such case, return type of the method must be the class type (non-primitive). 
 * 
 * class A{  
A getA(){  
return this;  
}  
void msg(){System.out.println("Hello java");}  
}  
class Test1{  
public static void main(String args[]){  
new A().getA().msg();  
}  
}  
 */
