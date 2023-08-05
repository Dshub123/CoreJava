package com.demo.arraylist.dao;

import java.util.List;

import com.demo.arraylist.bean.Product;

public interface ProductDao {

	void save(Product product);

	boolean deleteById(int id);

	boolean deleteByName(String nm);

	List<Product> getAll();

	Product getById(int id);

	List<Product> getByQty(int qty);

}
