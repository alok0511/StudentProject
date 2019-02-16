package com.capgemini.takehome.dao;

import java.util.Map;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO {

	@Override
	public Product getProductDetails(int productCode) {
		Map<Integer,Product> products = CollectionUtil.getCollection();
		
		return products.get(productCode);
	}

}
