package com.demo.arraylist.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.arraylist.bean.Product;

public class ProductDaoImpl implements ProductDao{
	
	private static List<Product> plist;
	
	static {
		plist = new ArrayList<>();
		plist.add(new Product(11,"Nike Air","shoes by nike",7,25000.89));
		plist.add(new Product(5,"Campus","shoes by campus",45,1500.67));
		plist.add(new Product(89,"Casio Watch","vintage watch",15,5678.84));
		plist.add(new Product(12,"Boat Headset","premium headset",2,8499.34));
	}

	@Override
	public void save(Product product) {
		plist.add(product);
		
	}

	@Override
	public boolean deleteById(int id) {
		if(!plist.isEmpty()) {
			for(Product p : plist) {
				if(p.getProductId() == id) {
					plist.remove(p);
					return true;
				}
			}
		}
			
		return false;
	}

	@Override
	public boolean deleteByName(String nm) {
		if(!plist.isEmpty()) {
			for(Product p : plist) {
				if(p.getProductName().equals(nm) ) {
					plist.remove(p);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public List<Product> getAll() {
		return plist;
	}

	@Override
	public Product getById(int id) {
		if(!plist.isEmpty()) {
			for(Product p : plist) {
				if(p.getProductId() == id) {
					return p;
				}
			}
		}
		return null;
	}

	@Override
	public List<Product> getByQty(int qty) {
		List<Product> tempList = new ArrayList<>();
		
		for(Product p : plist) {
			if(p.getProductQty() > qty) {
				tempList.add(p);
			}
		}
		
		if(!tempList.isEmpty()) {
			return tempList;
		}
		
		return null;
		//return plist.stream().filter(x->x.getProductQty()>qty).collect(Collectors.toList());
	}
	
	

}
