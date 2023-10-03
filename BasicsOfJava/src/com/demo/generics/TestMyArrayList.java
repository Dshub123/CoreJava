package com.demo.generics;

public class TestMyArrayList {

	public static void main(String[] args) {
		
		MyArrayList<Integer> list = new MyArrayList<>();
		
		list.add(34);
//		list.add("sjhsjh");
//		list.add(67.6677);
//		list.add(94.45f);
		list.add(23);
		list.add(87);
		
		System.out.println(list);
	}

}
