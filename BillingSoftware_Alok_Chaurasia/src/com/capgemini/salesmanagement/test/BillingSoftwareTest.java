package com.capgemini.salesmanagement.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exception.ValidateProductCategoryException;
import com.capgemini.salesmanagement.exception.ValidateProductNameException;
import com.capgemini.salesmanagement.service.SaleService;

public class BillingSoftwareTest {
	
	SaleService sService = new SaleService();
	SaleDAO sDao = new SaleDAO();

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = com.capgemini.salesmanagement.exception.ValidateProductNameException.class)
	public void WhenTheNameIsNotValidThenItShouldThrowAnException() throws ValidateProductNameException{
		Sale sale = new Sale(1001, "Tv", "", LocalDate.now(), 2, 0, 40000);
		sService.validateProductName("Soft Toy", "Electronics");
	}
	
	@Test
	public void WhenTheAllProductDetailsAreValidThenStoreSuccessfully() {
		Sale sale = new Sale(1001, "Smart Phone", "Electronics", LocalDate.now(), 1, 0, 15000);
		sDao.insertSalesDetailsOfProducts(sale);
	}
	
	@Test(expected = com.capgemini.salesmanagement.exception.ValidateProductCategoryException.class)
	public void WhenTheCategoryIsNotValidThenThrowAnError() throws ValidateProductCategoryException {
		Sale sale = new Sale(1001, "Tv", "Carpenter", LocalDate.now(), 3, 0, 25000);
		sService.validateProductCat(sale.getCategory());
	}

}
