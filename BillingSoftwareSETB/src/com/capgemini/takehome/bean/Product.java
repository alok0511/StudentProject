package com.capgemini.takehome.bean;

public class Product {
	private int productId;
	private String productName;
	private String productCategory;
	private int productPrice;
	private int quantity;
	private int lineTotal;
	private String prductDescription;
	public Product(int productId, String productName, String productCategory, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(int lineTotal) {
		this.lineTotal = lineTotal;
	}
	public String getPrductDescription() {
		return prductDescription;
	}
	public void setPrductDescription(String prductDescription) {
		this.prductDescription = prductDescription;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productCategory=" + productCategory + ", productPrice="
				+ productPrice + ", quantity=" + quantity + ", lineTotal=" + lineTotal + ", prductDescription="
				+ prductDescription + "]";
	}
	
	

}
