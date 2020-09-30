package com.collectionConcepts;

import java.util.HashSet;
import java.util.Iterator;

public class SetConcept {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(7);
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
