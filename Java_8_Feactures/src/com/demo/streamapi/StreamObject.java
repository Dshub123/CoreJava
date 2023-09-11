package com.demo.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		//Stream API - collection
		//collections / group of objects
		
		//1) Blank stream
		
		Stream<Object> emptystream = Stream.empty();
		
		//2) Stream of method used to create stream of array,object,collection
		String countries[] = {"India","USA","UK","Russia"};
		Stream<String> stream = Stream.of(countries);
		
		stream.forEach(x->System.out.print(x+" "));
		//System.out.println("Hello shruti");
		
		
		//3) Arrays.stream() method
		 Arrays.stream(new int[]{23,55,76,90,2}).forEach(e -> System.out.print(e+" "));
		 //System.out.println(IntStream);
		 
		 
	}

}
