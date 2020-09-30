package com.collectionConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcepts {

	public static void main(String[] args) 
	{
		//Hash map is a class which implements map interface
		//extends abstract Map
		//Properties
		/*Contains unique elements
		Store values on key and value pairs
		One null key is allowed and multiple null value is allowed
		it maintains no order*/
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Selenium");
		hm.put(1, "QTP");
		hm.put(2,"Test Complete");
		hm.put(3,"Soap uI");
		hm.put(-1, "Katalon");
		hm.put(-2,"Protractor");
		hm.put(-3,"Jenkins");
		
		//Fetching value from specific key
		System.out.println(hm.get(0));
		System.out.println(hm.get(-1));
		System.out.println(hm.get(4)); // this will give null and not exception
		
		//printing values
		for(Entry<Integer,String> m : hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue() );
		}
		System.out.println(hm);
		hm.remove(2);
		System.out.println(hm);
		
		System.out.println("****Storing class objects******");
		//Storing Class objects
		
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Apoorav", 26, "QA");
		Employee e2 = new Employee("Misra", 27, "Devops");
		Employee e3 = new Employee("Abu", 26, "Dev");
		
		emp.put(1,e1);
		emp.put(2,e2);
		emp.put(3,e3);
		
		//Traversing the hash map
		
		//Using for loop
		System.out.println("****Using For loop****");
		for(int i=1;i<=emp.size();i++) // If we use key as 0 then start i from 0 and <size
										// otherwise we will get null pointer exception
		{
			Employee e = emp.get(i);
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
		
		//Using for each loop and entry set
		System.out.println("****Using for each loop****");
		for(Entry<Integer,Employee> e : emp.entrySet())
		{
			int key = e.getKey();
			Employee value = e.getValue();
			System.out.println("Key: "+key+"  Info  "+value.name+" "+value.dept+" "+value.age);
		}
		
		//Using iterator
		
		System.out.println("******Using Iterator*******");
		Iterator<Entry<Integer, Employee>> it = emp.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,Employee> entry = (Entry<Integer, Employee>) it.next();
			int key = entry.getKey();
			Employee value = entry.getValue();
			
			System.out.println("key: "+key+" Value: "+value.name+" "+value.dept+" "+value.age);
		}
		
		//Using for each method
		System.out.println();
		hm.forEach((k, v) -> System.out.println(k + " : " + (v)));
		
	}

}
