package com.demo.queues;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TestQueue {

	public static void main(String[] args) {
		
		//The type of the PriorityQueue is Integer.
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		//The elements are added to the PriorityQueue
		queue.addAll( Arrays.asList( 9, 2, 3, 1, 3, 8 ) );
		
		//The PriorityQueue sorts the elements by using compareTo method of the Integer Class
		//The head of this queue is the least element with respect to the specified ordering
		System.out.println( queue ); //The Output: [1, 2, 3, 9, 3, 8]
		queue.remove();
		System.out.println( queue ); //The Output: [2, 3, 3, 9, 8]
		queue.remove();
		System.out.println( queue ); //The Output: [3, 8, 3, 9]
		queue.remove();
		System.out.println( queue ); //The Output: [3, 8, 9]
		queue.remove();
		System.out.println( queue ); //The Output: [8, 9]
		queue.remove();
		System.out.println( queue ); //The Output: [9]
		queue.remove();
		System.out.println( queue ); //The Output: []
		
		
	}
}
