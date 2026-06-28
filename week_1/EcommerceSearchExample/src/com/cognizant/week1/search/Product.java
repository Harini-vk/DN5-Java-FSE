package com.cognizant.week1.search;

public class Product {
	
	private int PrdId;
	private String PrdName;
	private String PrdCategory;
	
	public Product(int productID, String productName, String Category) {
		this.PrdId = productID;
		this.PrdName = productName;
		this.PrdCategory = Category;
	}
	
	
	public int getProductID() {
		 return PrdId;
	}
	
	public String getName() {
		return PrdName;
	}
	
	public String getCat() {
		return PrdCategory;
	}
	
	@Override
	public String toString() {
		return "Product [ID=" + PrdId +
                ", Name=" + PrdName +
                ", Category=" + PrdCategory + "]";
	}
	

}
