package com.demo.stacks;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack();
		System.out.println("stack: " + st);

		st.push(10);
		System.out.println("10 was pushed to the stack");
		System.out.println("stack: " + st);

		st.push(15);
		System.out.println("15 was pushed to the stack");
		System.out.println("stack: " + st);

		st.push(80);
		System.out.println("80 was pushed to the stack");
		System.out.println("stack: " + st);

		st.pop();
		System.out.println("80 was popped from the stack");
		System.out.println("stack: " + st);

		st.pop();
		System.out.println("15 was popped from the stack");
		System.out.println("stack: " + st);

		st.pop();
		System.out.println("10 was popped from the stack");
		System.out.println("stack: " + st);

		if(st.isEmpty())
		{
			System.out.println("empty stack");
		}
	}

}


