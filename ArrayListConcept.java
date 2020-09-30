package com.collectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;

public class ArrayListConcept {

	public static void main(String[] args) 
	{
		//dynamic array
		//Properties of array list:
		// 1. Can contain duplicate values
		//2. Maintains insertion order
		//3. It is not synchronised - that means it is thread safe
		//4. Allows you random access to fetch the element because.. 
		//..it stores the value on the basis of indexes
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size()); // length of the array list
		
		ar.add(40);
		ar.add(50);
		ar.add(50);
		
		System.out.println(ar.size()); 
		
		//to print all the values of array list
		//1-for loop 2- iterator
		
		//Using for loop
		for(int i=0;i<ar.size();i++)
		{
			System.out.println("Value is: "+ar.get(i));
		}
		
		System.out.println("****************");
		// Using for each loop
		for (Object object : ar) {
			System.out.println("Value using for each: "+object);
		}
		System.out.println("****************");
		//Using iterator
		Iterator<Integer> it = ar.iterator();
		while(it.hasNext())
		{
			System.out.println("Value using iterator: "+it.next());
		}
		
		System.out.println("*******************");
		//Employee class objects
		
		Employee e1 = new Employee("Apoorav", 26, "QA");
		Employee e2 = new Employee("Misra", 27, "Devops");
		Employee e3 = new Employee("Abu", 26, "Dev");
		
		ArrayList<Employee> ar1 = new ArrayList<Employee>();
		
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		//Iterator to traverse the values
		
		Iterator<Employee> itr = ar1.iterator();
		while(itr.hasNext())
		{
			Employee emp = itr.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("***************Using for each loop******************");
		//Using for each loop
		for (Employee employee : ar1) 
		{
			System.out.println(employee.name+" "+employee.age+" "+employee.dept);
		}
		
		System.out.println("***************Using for loop******************");
		//Using for loop
		for(int i=0;i<ar1.size();i++)
		{
			Employee empl = ar1.get(i);
			System.out.println(empl.name+" "+empl.dept+" "+empl.age);
		}
		
		
	}

}
