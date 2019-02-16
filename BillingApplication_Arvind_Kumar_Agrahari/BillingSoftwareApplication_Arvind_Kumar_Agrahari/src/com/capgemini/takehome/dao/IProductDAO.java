package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;

public interface IProductDAO {
	Product getProductDetails(int productCode); // For getting Product details based on the product code
}
