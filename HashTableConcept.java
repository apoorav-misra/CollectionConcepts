package com.collectionConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) 
	{
		Hashtable ht1 = new Hashtable();
		ht1.put(1,"Ruby");
		ht1.put(2,"Python");
		ht1.put(3,"Java");
		ht1.put(-1,".Net");
		ht1.put(-2,"C++");
		ht1.put(-3,"C#");
		//creating a clone
		Hashtable ht2 = new Hashtable<>();
		ht2 = (Hashtable)ht1.clone();
		
		System.out.println("Values from ht1: "+ht1);
		System.out.println("Values from ht2: "+ht2);
		
		ht2.clear();
		
		System.out.println("Values from ht1: "+ht1);
		System.out.println("Values from ht2: "+ht2);
		
		//conatins value
		Hashtable st = new Hashtable();
		st.put("A","Apoorav");
		st.put("B","TA");
		st.put("C","Selenium");
		
		if(st.containsValue("Apoorav"))
		{
			System.out.println("Found");
		}
		
		//printing all the values from hashtable using enumeration -- Enumenration elements()
		 Enumeration e = ht1.elements();
		 
		 while(e.hasMoreElements())
		 {
			 System.out.println(e.nextElement());
		 }
		
		 //Get all the values from hash table using entry set 
		 
		 Set s = ht1.entrySet();
		 
		 System.out.println(s);
		 
		
	}

}
