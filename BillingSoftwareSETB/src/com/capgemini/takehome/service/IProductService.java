package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;

public interface IProductService {
	Product getProductDetails(int productCode) throws Exception;

}
