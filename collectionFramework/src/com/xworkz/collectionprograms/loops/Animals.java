package com.xworkz.collectionprograms.loops;

import java.util.Collection;
import java.util.HashSet;

public class Animals {
	public static void main (String[]  shubu)
	{
		
		Collection<String> collection = new HashSet();		
		
		
		collection.add("pig");
		collection.add("camel");
		collection.add("elephant");
		collection.add("monkey");
		collection.add("lion");
		collection.add("tiger");
		collection.add("zebra");
		collection.add("cat");
		collection.add("dog");
		collection.add("horse");
		collection.add("fox");
		collection.add("cow");
		collection.add("panda");
		collection.add("gorilla");
		collection.add("deer");
		collection.add("buffelow");
		collection.add("sheep");
		collection.add("goat");
		collection.add("dolphin");
		System.out.println(collection);
		
		System.out.println(System.lineSeparator());
		
		System.out.println(collection.size());
		
		System.out.println(System.lineSeparator());
		
		System.out.println("after the clear data");
		
		collection.clear();
		
		System.out.println(collection);
		
		
		
		
		
	}

}
