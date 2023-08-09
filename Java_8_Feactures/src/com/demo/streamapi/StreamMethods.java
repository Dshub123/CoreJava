package com.demo.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		
		
		//1) filter method which takes predicate which is boolean value
			 //filter(predicate) this returns true or false value
			//if true it will collect the value
		
		  List<Integer> list = Arrays.asList(2,6,1,44,56,78,33);
		  System.out.println(list);
		  
		  List<Integer> newList = list.stream().filter(e -> e%2==0).collect(Collectors.toList());
		  System.out.println(newList);
		
		
		//2) map method 
		  // map method returns result of particular operation
		  // in below example values present in list are doubled and collected into the list
		  List<Integer> newList2 = list.stream().map(e -> e*2).collect(Collectors.toList());
		  System.out.println(newList2);
	}

}
