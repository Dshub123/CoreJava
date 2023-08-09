package com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		
		//		MyInter myin = new MyInterImpl();
		//		myin.sayHello("Shubham");

		//Creating anonymus class

		MyInter i = new MyInter() {

			@Override
			public void sayHello(String name) {
				System.out.println("Hello "+name);

			}
		};

		i.sayHello("John");
		
		
		//using lambda expression
		
		MyInter in = (name) -> System.out.println("Hay "+name+" how are you");

		
		in.sayHello("Miller");
		

		//		List<Integer> alist = new ArrayList<>();
		//		
		//		alist.add(12);
		//		alist.add(78);
		//		alist.add(90);
		//		alist.add(1445);
		//		alist.add(5567);
		//		
		//		alist.forEach(x -> System.out.print(x+" "));

	}

}
