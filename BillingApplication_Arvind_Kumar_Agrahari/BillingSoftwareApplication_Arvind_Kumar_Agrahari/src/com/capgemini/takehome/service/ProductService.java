package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.exception.InvalidProductCodeException;

public class ProductService implements IProductService {
	
	private IProductDAO productDao;
	
	//Parameterized Constructor for initialize the IProductDAO
	public ProductService(IProductDAO productDao) {
		super();
		this.productDao = productDao;
	}

	//Implementation of getting details of IProductService interface
	@Override
	public Product getProductDetails(int productCode) throws InvalidProductCodeException {
		Product product = productDao.getProductDetails(productCode); // Getting the product object from DAO
		
		//Check If there is no such product exist in database then throw the exception
		if(product==null) {
			throw new InvalidProductCodeException("Sorry! The Product Code "+productCode+" is not available.");
		}
		return product; //  If product exist in database then return the product object
	}

}
