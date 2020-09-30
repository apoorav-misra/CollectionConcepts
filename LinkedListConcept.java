package com.collectionConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) 
	{
		LinkedList<String> li = new LinkedList<String>();
		
		//add
		li.add("test");
		li.add("qtp");
		li.add("Selenium");
		li.add("RFT");
		
		System.out.println(li.size());
		System.out.println("Contents of the linked list: "+li);
		
		li.addFirst("First");
		li.addLast("Last");
		
		System.out.println(li);
		System.out.println("*****");
		//get the value
		for(int i =0;i<li.size();i++)
		{
			System.out.print(li.get(i)+" ");
		}
		System.out.println();
		li.set(0,"Change first elememnt");
		for(int i =0;i<li.size();i++)
		{
			System.out.print(li.get(i)+" ");
		}
		
		li.removeLast();
		li.removeFirst();
		System.out.println();
		
		System.out.println(li);
		
		//using for each loop
		for (String s : li) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//Using iterator
		Iterator<String> it = li.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		//Using while loop
		int num=0;
		while(li.size()>num)
		{
			System.out.print(li.get(num)+" ");
			num++;
		}
	}

}
