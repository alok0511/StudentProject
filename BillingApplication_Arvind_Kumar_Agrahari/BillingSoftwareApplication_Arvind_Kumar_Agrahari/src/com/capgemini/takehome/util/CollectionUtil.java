package com.capgemini.takehome.util;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.takehome.bean.Product;

public class CollectionUtil {

	// Hash map for storing the record of products
	private static Map<Integer, Product> products = new HashMap<Integer, Product>();
	
	//For storing the products in map products
	static {
		products.put(1001, new Product(1001, "iPhone", "Electronics", 35000));
		products.put(1002, new Product(1002, "LEDTV", "Electronics", 45000));
		products.put(1003, new Product(1003, "Teddy", " Toys", 800));
		products.put(1004, new Product(1004, "Telescope", "Toys", 5000));

	}

	// For getting the products map from utility package
	public static Map<Integer, Product> getCollection() {
		return products; // return the collection map i.e products
	}
}
