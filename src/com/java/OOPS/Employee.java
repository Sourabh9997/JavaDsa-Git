package com.java.OOPS;
import java.io.Serializable;    

public class Employee implements Serializable {
	// Serialization: The writeObject() method of the ObjectOutputStream class is used to serialize an object. 
	//It sends the object to the output stream.
	
	//Deserialization: The method readObject() of ObjectInputStream class is used to deserialize an object.
	//It references objects out of a stream.
	int empid;    
	String empname;    
	public Employee(int empid, String empname)   
	{    
	this.empid = empid;    
	this.empname = empname;  
}
}