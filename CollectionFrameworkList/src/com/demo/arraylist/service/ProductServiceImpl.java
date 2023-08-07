package com.demo.arraylist.service;

import java.util.List;
import java.util.Scanner;

import com.demo.arraylist.bean.Product;
import com.demo.arraylist.dao.ProductDao;
import com.demo.arraylist.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	
	private ProductDao pdao;
	
	public ProductServiceImpl() {
		pdao = new ProductDaoImpl();
	}

	@Override
	public void addNewProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id: ");
		Integer pid = sc.nextInt();
		System.out.println("Enter product name: ");
		String pname = sc.next();
		System.out.println("Enter product desc: ");
		String desc = sc.next();
		System.out.println("Enter product Qty: ");
		Integer qty = sc.nextInt();
		System.out.println("Enter product price: ");
		Double price = sc.nextDouble();
		
		pdao.save(new Product(pid,pname,desc,qty,price));
	}

	@Override
	public boolean removeById(int id) {
		
		return pdao.deleteById(id);
	}

	@Override
	public boolean removeByName(String nm) {

		return pdao.deleteByName(nm);
	}

	@Override
	public List<Product> displayAll() {
		
		return pdao.getAll();
	}

	@Override
	public Product findById(int id) {
		
		return pdao.getById(id);
	}

	@Override
	public List<Product> sortByPrice() {
		
		return pdao.orderByPrice();
	}

	@Override
	public List<Product> findByqty(int qty) {
		
		return pdao.getByQty(qty);
	}

	@Override
	public boolean modifyPrice(int id, float pr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product findByName(String nm) {
		// TODO Auto-generated method stub
		return null;
	}

}
