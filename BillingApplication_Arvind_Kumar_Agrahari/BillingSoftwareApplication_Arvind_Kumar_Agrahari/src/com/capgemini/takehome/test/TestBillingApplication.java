package com.capgemini.takehome.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class TestBillingApplication {

	IProductDAO productDao; // Creating a reference for IProductDAO
	IProductService productService; // Creating a reference for IProductService

	@Before
	public void setUp() throws Exception {
		productDao = new ProductDAO(); // Creating the object of ProductDAO class
		productService = new ProductService(productDao); // Creating the object of ProductService class
	}
	
	/*
	 * Test when the entered product code is not in database the system should throw an exception i.e. InvalidProductCodeException
	 */
	@Test(expected = com.capgemini.takehome.exception.InvalidProductCodeException.class)
	public void whenTheEnteredProductCodeIsNotInDatabaseThenSystemShouldThrowException() throws InvalidProductCodeException {
		productService.getProductDetails(1005); // Invalid product code is passed which is not in database
	}
	
	/*
	 *Test when the entered product code is correct then system should return a product object
	 */
	@Test
	public void whenTheEnteredProductCodeIsCorrectThenSystemShouldReturnAProductObject()
			throws InvalidProductCodeException {
		Product product = new Product(1003, "Teddy", " Toys", 800); // Creating the product object for checking the excepted output
		assertEquals(product, productService.getProductDetails(1003)); // Check the expected and actual output
	}

}
