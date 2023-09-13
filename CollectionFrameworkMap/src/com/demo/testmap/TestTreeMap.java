package com.demo.testmap;

import java.util.TreeMap;

public class TestTreeMap {
	
	
	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(10, "ten");
		treeMap.put(4, "four");
		treeMap.put(1, "one");
		treeMap.put(12, "twelve");
		
		
		System.out.println(treeMap.firstEntry()); // Prints 1=one
		System.out.println(treeMap.lastEntry()); // Prints 12=twelve
		System.out.println(treeMap.size()); // Prints 4, since there are 4 elemens in the map
		System.out.println(treeMap.get(12)); // Prints twelve
		System.out.println(treeMap.get(15)); // Prints null, since the key is not found in the map
	}

}
