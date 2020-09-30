package com.collectionConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Mix {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		HashMap<Integer,Employee> map = new HashMap<Integer, Employee>();
		HashSet<Employee> set = new HashSet<Employee>();
		
		Employee e = new Employee("A", 2, "X");
		Employee e1 = new Employee("A", 3, "X");
		Employee e2 = new Employee("A", 2, "X");
		Employee e3 = new Employee("B", 3, "Y");
		Employee e4 = new Employee("C", 5, "Z");
		
		
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		
		set.add(e);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		
		map.put(1,e);
		map.put(2,e1);
		map.put(3,e2);
		map.put(4,e3);
		map.put(5,e4);
		
		System.out.println("**************Using for Loop*******");
		System.out.println("List");
		for(int i=0;i<list.size();i++) {
			
			Employee emp = list.get(i);
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}
		System.out.println("Map");
		
		for(int j=0; j<map.size();j++) {
			Employee emp = map.get(j+1);
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
			
		}
		
		System.out.println("****************Using Iterator********************");
		System.out.println("List");
		Iterator<Employee> it_list = list.iterator();
		while(it_list.hasNext()) {
			Employee emp = it_list.next();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}
		
		System.out.println("Set");
		Iterator<Employee> it_set = set.iterator();
		while(it_set.hasNext()) {
			Employee emp = it_set.next();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}
		
		System.out.println("Map");
		Iterator<Entry<Integer, Employee>> it_map = map.entrySet().iterator();
		while(it_map.hasNext()) {
			Entry<Integer, Employee> x = it_map.next();
			Employee emp = x.getValue();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}
		
		System.out.println("*********************Using for Each**********************************");
		System.out.println("List");
		for(Employee emp : list) {
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}
		
		System.out.println("Set");
		for(Employee emp : set) {
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}
		
		System.out.println("Map");
		for(Entry<Integer,Employee> x : map.entrySet()) {
			Employee emp = x.getValue();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}
		
		
		
		
		
		
	}

}
