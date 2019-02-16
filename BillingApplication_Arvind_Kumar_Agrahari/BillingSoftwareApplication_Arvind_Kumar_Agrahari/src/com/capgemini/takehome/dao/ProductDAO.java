package com.capgemini.takehome.dao;

import java.util.Map;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO {

	//Implementation of getting details of IProductDAO interface
	@Override
	public Product getProductDetails(int productCode) {
		Map<Integer, Product> products = CollectionUtil.getCollection(); // Getting the map from collection utility
		return products.get(productCode); // return the product object for corresponding product code
	}

}
