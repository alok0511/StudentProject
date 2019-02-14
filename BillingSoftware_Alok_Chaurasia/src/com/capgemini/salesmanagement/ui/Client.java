package com.capgemini.salesmanagement.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;                                          //Importing Packages
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exception.ValidateProductCategoryException;
import com.capgemini.salesmanagement.exception.ValidateProductNameException;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;



public class Client {                                                                       //Class begins

	public static void main(String[] args) throws ValidateProductCategoryException, ValidateProductNameException {         //main begins
		
		
		SaleService saleService = new SaleService();
		SaleDAO saleDao = new SaleDAO();
		
		
		Sale s = new Sale(1001, "Smart Phone", "Electronics", LocalDate.now(), 2, (int)Math.random(), 70000);
		Sale s1 = new Sale(1004, "Barbee Doll", "Toys", LocalDate.now(), 4, (int)Math.random(), 200);
		Sale s2 = new Sale(1002, "Telescope", "Toys", LocalDate.now(), 3, (int)Math.random(), 10000);
		Sale s3 = new Sale(1003, "Video Game", "Electronics", LocalDate.now(), 1, (int)Math.random(), 5000);
		if(saleService.validateProduct(s.getProdCode()))
				System.out.println("true");
		else
			System.out.println("false");
		
		if(saleService.validateProductPrice(s.getPrice()))
			System.out.println("true");
		else
			System.out.println("false");
		
		if(saleService.validateProduct(s1.getProdCode()))
			System.out.println("true");
		else
			System.out.println("false");
		
		if(saleService.validateProductPrice(s1.getPrice()))
			System.out.println("true");
		else
			System.out.println("false");
		
		if(saleService.validateProduct(s2.getProdCode()))
			System.out.println("true");
		else
			System.out.println("false");
		
		if(saleService.validateProductPrice(s2.getPrice()))
			System.out.println("true");
		else
			System.out.println("false");
		
		if(saleService.validateProduct(s3.getProdCode()))
			System.out.println("true");
		else
			System.out.println("false");
		
		if(saleService.validateProductPrice(s3.getPrice()))
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println(saleDao.insertSalesDetailsOfProducts(s));
		System.out.println("\n");
		System.out.println(saleDao.insertSalesDetailsOfProducts(s1));
		System.out.println("\n");
		System.out.println(saleDao.insertSalesDetailsOfProducts(s2));
		System.out.println("\n");
		System.out.println(saleDao.insertSalesDetailsOfProducts(s3));
		

	}                                                                                               //main ends

}                                                                                                  //class ends
