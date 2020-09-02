package com.vendormachine.model;

public class Product {
	String productName;
	String coinType;
	int productID;
	int quantity;

	public Product() {
		super();
	}

	public Product(String productName, String coinType, int productID, int quantity) {
		this.productName = productName;
		this.coinType = coinType;
		this.productID = productID;
		this.quantity = quantity;
	}

	public String getCoinType() {
		return coinType;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setCoinType(String coinType) {
		this.coinType = coinType;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
