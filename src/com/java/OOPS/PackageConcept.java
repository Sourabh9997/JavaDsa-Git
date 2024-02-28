package com.java.OOPS;

public class PackageConcept {

	/*
	 * A java package is a group of similar types of classes, interfaces and
	 * sub-packages.
	 * 
	 * Package in java can be categorized in two form, built-in package and
	 * user-defined package.
	 * 
	 * There are many built-in packages such as java, lang, awt, javax, swing, net,
	 * io, util, sql etc.
	 * 
	 * Here, we will have the detailed learning of creating and using user-defined
	 * packages.
	 * 
	 * 
	 * 
	 * Advantage of Java Package 1) Java package is used to categorize the classes
	 * and interfaces so that they can be easily maintained.
	 * 
	 * 2) Java package provides access protection.
	 * 
	 * 3) Java package removes naming collision.
	 * 
	 * 
	 * To compile
	 * 
	 * Use-javac -d . Simple.java
	 * 
	 * To Compile: javac -d . Simple.java To Run: java mypack.Simple
	 * 
	 * 
	 * There are three ways to access the package from outside the package.
	 * 
	 * import package.*; import package.classname; fully qualified name.
	 * 
	 * Using fully qualified name
	 * 
	 * If you use fully qualified name then only declared class of this package will
	 * be accessible. Now there is no need to import. But you need to use fully
	 * qualified name every time when you are accessing the class or interface.
	 * 
	 * It is generally used when two packages have same class name e.g. java.util
	 * and java.sql packages contain Date class.
	 * 
	 * //save by A.java  
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  
//save by B.java  
package mypack;  
class B{  
  public static void main(String args[]){  
   pack.A obj = new pack.A();//using fully qualified name  
   obj.msg();  
  }  
}  
	 * 
	 * 
	 * 
	 *   If you import a package, subpackages will not be imported.

	 * if you import a package, all the classes and interface of that package will be imported excluding the classes
	 *  and interfaces of the subpackages. 
	 * Hence, you need to import the subpackage as well.
	 * 
	 * To compile
	 * 
	 * e:\sources> javac -d c:\classes Simple.java

To Run:
To run this program from e:\source directory, you need to set classpath of the directory where the class file resides.
e:\sources> set classpath=c:\classes;.;
e:\sources> java mypack.Simple
	 * 
	 * Another way to run this program by -classpath switch of java:
The -classpath switch can be used with javac and java tool.

To run this program from e:\source directory, you can use -classpath switch of java that tells where to look for class file. For example:

e:\sources> java -classpath c:\classes mypack.Simple
	 * 
	 */
}
