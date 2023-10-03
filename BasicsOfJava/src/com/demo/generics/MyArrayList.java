package com.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> {

	private T value;
	private List<T> list;
	
	public MyArrayList() {
		list = new ArrayList<>();
	}
	
	public MyArrayList(Integer size) {
		list = new ArrayList<>(size);
	}
	
	public void add(T value) {
		list.add(value);
	}
	
	public void remove(T value) {
		list.remove(value);
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}
