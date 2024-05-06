package com.test;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo 
{
	void meth1()
	{
		TreeSet ts=new TreeSet();
		ts.add(100);// insertion order is not maintained (sorting order is ascending order)
		//ts.add("Java"); // it  will not allow heterogeneous data
		//ts.add(null); //  it  will not allow null value
		ts.add(400); // Duplicates are not allowed
		ts.add(200); // default capacity is 16
		ts.add(500); // it is available from java 1.2v
		ts.add(300); //it is not SYNCHRONISED
		System.out.println(ts);
		
		Iterator i = ts.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

	public static void main(String[] args)
	{
		new TreeSetDemo().meth1();

	}

}
