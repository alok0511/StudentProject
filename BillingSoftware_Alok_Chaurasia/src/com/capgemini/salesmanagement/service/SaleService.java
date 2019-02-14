package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.ValidateProductCategoryException;
import com.capgemini.salesmanagement.exception.ValidateProductNameException;

public class SaleService implements ISaleService {
	
	
	 
	@Override
	public boolean validateProduct(int productId) 
	{
		if(productId == 1001 || productId == 1002 || productId == 1003 || productId == 1004)
			
			return true;   
		else
			return false;
		
	}
	
	public boolean validateQuantity(int qty) 
	{
		if(qty > 0 && qty < 5)
			return true;   
		else
			return false;
		
	}
	
	
	@Override
	public boolean validateProductCat(String prodCat) throws ValidateProductCategoryException
	{
		if(prodCat.equals("Electronics") || prodCat.equals("Toys"))
			return true;     
		else
			throw new ValidateProductCategoryException("You Entered Wrong Product Category");
			
		
	}
	
	
	@Override
	public boolean validateProductName(String prodName, String prodCat) throws ValidateProductNameException
	{
		if(prodCat.equals("Electronics"))
		{
			if(prodName.equals("TV") || prodName.equals("Smart Phone") || prodName.equals("Video Game"))
					return true;    
		}
		
		if(prodCat.equals("Toys"))
		{
			if(prodName.equals("Soft Toy") || prodName.equals("Telescope") || prodName.equals("Barbee Doll"))
					return true;    
		}
		throw new ValidateProductNameException("You Entered Wrong Product Name");	
	     
	}
	
	
	@Override
	public boolean validateProductPrice(float price) 
	{
		
		try {
			if(price >= 200f)
				return true;          
		}catch(Exception e) {
		}
		return false;
		
		
	}

	
}
