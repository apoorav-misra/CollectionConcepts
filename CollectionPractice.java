package com.collectionConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CollectionPractice {

	public static void main(String[] args) {
		String name = "Apoorav Misra";
		char[] c = name.toLowerCase().toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<c.length;i++) {
			if(!map.containsKey(c[i]))
				map.put(c[i], 1);
			else
				map.put(c[i], map.get(c[i])+1);
		}
		
		//Traversing through the map
		for(Entry e : map.entrySet()) {
			System.out.println("Key: "+e.getKey()+"     Value: "+e.getValue());
		}
		
		System.out.println("~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~");
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry e = (Entry) it.next();
			System.out.println("Key: "+e.getKey()+"     Value: "+e.getValue());
		}
	}

}
