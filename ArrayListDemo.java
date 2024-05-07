package com.test;
import java.util.*;
public class ArrayListDemo 
{
	void meth1()
	{
		System.out.println("Implementing ArrayList");
		ArrayList al = new ArrayList();
		al.add(100); //Insertion order is maintained
		al.add("Java"); // Heterogeneous data is allowed
		al.add(300); // ArrayList is available from java 1.2v
		al.add(400); // default capacity is 10
		al.add(null); // null is allowed
		al.add('J'); // capacity increases half 
		al.add(200); // it is not synchronized by default
		al.add(200); // Duplicates are allowed
		
		System.out.println(al);
		
		System.out.println();
		System.out.println("----------------Retrieving the data by using forEach loop -------------");
		
		for(Object o : al)
		{
			System.out.println(o);
		}
		
		System.out.println();
		System.out.println("---------------Retrieving the data by using forloop-------------");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("----------------Retrieving the data by uing Iterator------------");
		System.out.println();
		
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
	public static void main(String[] args) 
	{
		new ArrayListDemo().meth1();

	}

}
