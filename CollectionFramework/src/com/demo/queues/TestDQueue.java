package com.demo.queues;

import java.util.Deque;
import java.util.LinkedList;

public class TestDQueue {

	public static void main(String[] args) {

		Deque<String> dequeA = new LinkedList<>();
		dequeA.add("element 1"); //add element at tail
		dequeA.addFirst("element 2"); //add element at head
		dequeA.addLast("element 3"); //add element at tail

		String firstElement0 = dequeA.element();
		String firstElement1 = dequeA.getFirst();
		String lastElement = dequeA.getLast();
		
		System.out.println(firstElement0);
		System.out.println(firstElement1);
		System.out.println(lastElement);
		
		//Removing Elements
//		 Element = dequeA.remove();
//		 firstElement = dequeA.removeFirst();
//		 lastElement = dequeA.removeLast();

	}

}
