package com.capgemini.salesmanagement.service;

import java.util.HashMap;


import com.capgemini.salesmanagement.bean.Sale;                                           //Importing Packages
import com.capgemini.salesmanagement.exception.ValidateProductCategoryException;
import com.capgemini.salesmanagement.exception.ValidateProductNameException;

public interface ISaleService {

	boolean validateProduct(int productId);
	boolean validateProductCat(String prodCat) throws ValidateProductCategoryException;
	boolean validateProductName(String prodName, String prodCat) throws ValidateProductNameException;
	boolean validateProductPrice(float price) ;
	boolean validateQuantity(int qty);

}
