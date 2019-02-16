package com.capgemini.takehome.ui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

// Class for user
public class Client {

	private static Scanner input = new Scanner(System.in); // Creating object of Scanner for taking input form user
	private static IProductDAO productDao = new ProductDAO(); // Creating object for ProductDAO class
	private static IProductService productService = new ProductService(productDao); // Creating object for ProductService class

	public static void main(String[] args) {
		showMenu();
	}

	// Showing menu to user and generate the function based on the choice
	private static void showMenu() {
		int choice;
		System.out.println(
				"*************************Welcome to Billing Software Application***************************************");
		while (true) {
			System.out.println(
					"*******************************************************************************************************");
			System.out.println("1.Generate Bill");
			System.out.println("2.Exit");
			System.out.print("Enter your choice : ");
			choice = input.nextInt(); // Getting the choice based on the menu
			switch (choice) {
			case 1:
				generateBill();
				break;
			case 2:
				System.out.println("Thank you for using this application!!");
				System.exit(0);
				break;
			default:
				System.out.println("You entered wrong choice!!"); // If wrong choice entered the default used
				break;
			}
		}

	}

	// Generating the bill based on the product code
	private static void generateBill() {
		System.out.print("Enter the product code : ");
		int productCode = input.nextInt(); // Getting the product code from user
		System.out.print("Enter the quantity : ");
		int quantity = input.nextInt(); // Getting the quantity form user

		// Validate the Product Code
		if (!validateProductCode(String.valueOf(productCode))) {
			System.out.println(
					"*******************************************************************************************************");
			System.out.println("Enter the valid product code");
		}
		// Validate the product quantity
		else if (!validateQuantity(quantity)) {
			System.out.println(
					"*******************************************************************************************************");
			System.out.println("Enter the valid quantity");
		}
		// Generate the bill based on the user inputs
		else {
			try {
				System.out.println(
						"*******************************************************************************************************");
				Product product = productService.getProductDetails(productCode); // Getting the product object based on the product code
				// Showing the bill if product code is valid
				System.out.println("Product Name :          " + product.getProductName());
				System.out.println("Product Category :      " + product.getProductCategory());
				System.out.println("Product Price (Rs) :    " + product.getProductPrice());
				System.out.println("Quantity :              " + quantity);
				System.out.println("Line Total (Rs) :       " + (quantity * product.getProductPrice()));
			}
			// If the Product is not in database then system throw an error
			catch (InvalidProductCodeException e) {
				System.err.println(e.getMessage());
			}
		}
	}

	// Validate the entered product code based on the length and the type of data
	private static boolean validateProductCode(String productCode) {
		Pattern pattern = Pattern.compile("[1-9]{1}[0-9]{3}"); // Creating pattern for four digit number
		Matcher match = pattern.matcher(productCode); // Matching the product code with pattern
		return (match.find() && match.group().equals(productCode)); // return true if it follow the pattern otherwise false
	}

	// Validate the entered quantity
	private static boolean validateQuantity(int quantity) {
		return quantity > 0 ? true : false; // return true if product quantity is more or equal to 1 otherwise false
	}

}
