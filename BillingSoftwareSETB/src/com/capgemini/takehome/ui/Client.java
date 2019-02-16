package com.capgemini.takehome.ui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client {
	private static Scanner sc = new Scanner(System.in);
	private static IProductDAO productDAO = new ProductDAO();
	private static IProductService productService = new ProductService(productDAO);
	
	

	public static void main(String[] args) {
		showMenu();

	}

	private static void showMenu() {
		int choice;
		while(true){
			System.out.println("----------Billing Software Application-------------\n");
			System.out.println("Press 1 to Generate Bill by entering Product code and quantity");
			System.out.println("Press 2 to exit");
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch(choice){
			case 1:
				generateBill();
				break;
			case 2:
				System.exit(0);
				break;
				default:System.out.println("You entered a wrong choice");
			}
		}
		
	}

	private static void generateBill() {
		System.out.println("Enter the product code");
		int productId = sc.nextInt();
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();
		if(!validateProductCode(String.valueOf(productId))){
			System.out.println("Enter valid Product code");
		}
		else if(!validateProductQuantity(quantity)){
			System.out.println("Enter Valid product quantity");
		}
		else{
			try{
				Product products = productService.getProductDetails(productId);
				System.out.println("Product Code :" + products.getProductId());
				System.out.println("Product Name :" + products.getProductName());
				System.out.println("Product Category :" + products.getProductCategory());
				System.out.println("Product Price :" + products.getProductPrice());
				System.out.println("Quantity :" + quantity);
				System.out.println("Line Total :" + (quantity * products.getProductPrice()));
			}
			catch(Exception e){
			}
			}
		
	}

	private static boolean validateProductQuantity(int quantity) {
		if(quantity > 0)
			return true;
		else
			return false;
			
	}

	private static boolean validateProductCode(String productId) {
		Pattern pattern = Pattern.compile("[1]{1}[0-9]{3}");
		Matcher mat = pattern.matcher(productId);
		
		return mat.matches();
		
		
	}

}
