package com.java.Multithreading;

public class Company {
//Synchronization concept,Producer -Consumer problem
	int n;
	boolean f=false;
	// f=false: chance: producer
	//f=true: chance :consumer
	synchronized public void produce_item(int n)throws Exception
	{
		if(f)
		{
			wait();
		}
		this.n=n;
		System.out.println("Produced : "+this.n);
		f=true;
		notify();
	}

	synchronized public int consume_item()throws Exception
	{
		if(!f)
		{
			wait();
		}
		System.out.println("Consumed : "+this.n);
		f=false;
		notify();
		return this.n;
	}
}
