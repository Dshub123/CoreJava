package com.demo.arraylist.service;

import java.util.List;

import com.demo.arraylist.bean.Product;

public interface ProductService {

	void addNewProduct();

	boolean removeById(int id);

	boolean removeByName(String nm);

	List<Product> displayAll();

	Product findById(int id);

	List<Product> sortByPrice();

	List<Product> findByqty(int qty);

	boolean modifyPrice(int id, float pr);

	Product findByName(String nm);

}
