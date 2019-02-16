package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;

public class ProductService implements IProductService {
	private IProductDAO productDAO;
	

	public ProductService(IProductDAO productDAO) {
		super();
		this.productDAO = productDAO;
	}


	@Override
	public Product getProductDetails(int productCode) throws Exception {
		Product products = productDAO.getProductDetails(productCode);
		if(products == null){
			throw new Exception();
		}
		
		return products;
	}

}
