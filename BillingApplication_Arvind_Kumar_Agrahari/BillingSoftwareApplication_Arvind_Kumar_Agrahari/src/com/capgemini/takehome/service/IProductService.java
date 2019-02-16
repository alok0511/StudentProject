package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.InvalidProductCodeException;

public interface IProductService {
	// For getting Product details based on the product code and check the availability of product code in database
	Product getProductDetails(int productCode) throws InvalidProductCodeException; 
}
