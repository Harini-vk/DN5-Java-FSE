package com.cognizant.week1.search;

public class Main {
	public static void main(String[] args) {
		
		Product [] products = {
				new Product(101,"Laptop","Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Phone", "Electronics")
		};
		SearchService s = new SearchService();
		System.out.print("Linear Search: ");
		System.out.println(s.linearSearch(products, "Phone"));
		
		System.out.print("Binary Search: ");
		System.out.println(s.binarySearch(products, "Phone"));
		
		
	}

}
