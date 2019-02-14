package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {                                                            //class begins
	
	private int saleId;
	private int prodCode;
	private String productName;
	private String category;
	private LocalDate saleDate;
	private int quantity;
	private float lineTotal;
	private int price;
	
	
	
	
	public Sale( int prodCode, String productName, String category, LocalDate saleDate, int quantity,
			float lineTotal, int price) {
		super();
		this.prodCode = prodCode;
		this.productName = productName;                                       //Constructor
		this.category = category;
		this.saleDate = saleDate;
		this.quantity = quantity;
		this.lineTotal = lineTotal;
		this.price = price;
	}
	
	
	
	public int getSaleId() {                                                  //getter and setter
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}

	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {                                               //toString(converting objects to string)
		return "SaleId=" + saleId + "\n Product Code=" + prodCode + "\nProduct Name=" + productName + "\nCategory="
				+ category + "\nSale Date=" + saleDate + "\nQuantity=" + quantity + "\nLine Total=" + lineTotal
				+ "\nPrice=" + price;
	}
	




	
	
	
}
