package com.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
	void meth1()
	{
		HashSet hs = new HashSet();
		hs.add(1000); //Insertion order is not maintained
		hs.add("Java");// HashSet allows heterogeneous elements
		hs.add(2000);// HashSet doesn't allows duplicate elements
		hs.add(null);// null is allow
		hs.add('J');// default capacity is 16
		hs.add(1000);// load factor is 0.75
		hs.add(3000);// its not synchronized by default
		hs.add(4000);// it is available from java 1.2
		
		System.out.println(hs);
		
		Iterator i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
	}

	public static void main(String[] args)
	{
		new HashSetDemo().meth1();

	}

}
