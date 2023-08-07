package com.demo.arraylist.comparators;

import java.util.Comparator;

import com.demo.arraylist.bean.Product;

public class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getProductPrice() > o2.getProductPrice()) {
			return 1;
		}
		else if(o1.getProductPrice() < o2.getProductPrice()) {
			return -1;
		}
		return 0;
	}
	
	

}
