package com.demo.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamApi {

	public static void main(String[] args) {
		
		
		//1) Create a list and filer out all even numbers from list
		
		List<Integer> list1 = List.of(2,34,50,21,89,67,112);  //this creates immutable list
		
		List<Integer> list2  = Arrays.asList(1,55,136,87);    //asList method also creates immutable lists
		
		List<Integer> list3 = new ArrayList<>();
		
		list3.add(22);
		list3.add(847);
		list3.add(104);
		list3.add(647);
		list3.add(36);
		list3.add(90);
		
		//list2.add(234);
		
		System.out.println(list2);
		System.out.println(list1);
		
		//Stream<Integer> stream = list1.stream();
		
		List<Integer> newList = list1.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> newList2 = list1.stream().filter(x->x>35).collect(Collectors.toList());
		System.out.println(newList2);
	}
}
