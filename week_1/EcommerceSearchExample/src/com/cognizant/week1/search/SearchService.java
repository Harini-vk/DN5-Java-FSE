package com.cognizant.week1.search;

public class SearchService {
	
	public Product linearSearch(Product[] products, String searchName) {
		for(int i = 0; i< products.length;i++) {
			if (products[i].getName().equalsIgnoreCase(searchName)) {
				return products[i];
			}
		}
		return null;
	}
	
	
	public Product binarySearch(Product[] products, String searchName) {
		int high = products.length - 1;
		int low = 0;
		while(low<=high) {
			int mid = (high + low) /2;
			Product midProduct = products[mid];
			int result = searchName.compareToIgnoreCase(midProduct.getName());
			if (result == 0) {
				return products[mid];
			}
			else if(result > 0) {
				low = mid+1;
			}
			else if(result < 0) {
				high = mid-1;
			}
		}
		return null;
		
 
		
	}

}
