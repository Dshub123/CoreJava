package com.demo.testmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		
		//first parameter in map is always a key and second parameter will be value.
		//data type of key will be anything but integer is preferable.
		Map<Integer,String> hmap = new HashMap<>();
		hmap.put(22,"abc");
		hmap.put(22,"def"); //if the key is same then the both key and value will be overwritten.
		hmap.put(78,"ghi");
		hmap.put(13,null); // one or more null values can be put into hash map.
		hmap.put(9,"ghi"); //values can be duplicate. 
		//hmap.put(null,"jkl");//only one null key is accepted in hash map.
		//hmap.put(null, null); //this key and value will overwrite the previous K and V
		
		
		 //System.out.println(hmap.entrySet());
		 
		 System.out.println(hmap.keySet()); //returns a set of keys present in hashmap
		 
		 hmap.putIfAbsent(13,"sss"); //if specific key is not assigned with value then assign it given value
		 
		 hmap.replace(22, "AAA"); //replaces the value of specific key
		 
		   System.out.println(hmap.size());
		 
		 System.out.println(hmap);
		 
		 Map<Integer,String> treemap = new TreeMap<>(hmap); // tree map sorts hash map with key
		 //it will not sort if any null key is present.
		 
//		 for(Integer i : hmap.keySet()) {
//			 treemap.put(i, hmap.get(i));
//		 }
		 
		 System.out.println(treemap);
		 
	}

}
