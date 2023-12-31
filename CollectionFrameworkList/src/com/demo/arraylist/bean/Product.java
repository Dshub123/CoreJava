package com.demo.arraylist.bean;

import java.util.Objects;

public class Product {
	
	private Integer productId;
	private String productName;
	private String productDesc;
	private Integer productQty;
	private Double productPrice;
	
	public Product() {
		super();
	}
	
	public Product(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Product(Integer productId,String productName, String productDesc, Integer productQty, Double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productQty = productQty;
		this.productPrice = productPrice;
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer id) {
		this.productId = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Integer getProductQty() {
		return productQty;
	}
	public void setProductQty(Integer productQty) {
		this.productQty = productQty;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productDesc, other.productDesc) && Objects.equals(productId, other.productId)
				&& Objects.equals(productName, other.productName) && Objects.equals(productPrice, other.productPrice)
				&& Objects.equals(productQty, other.productQty);
	}

	
	@Override
	public String toString() {
		return "[productName=" + productName + ", productDesc=" + productDesc + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + "]";
	}
	
}
