package com.vendormachine.model;
import javax.validation.constraints.NotNull;

public class UserOrderModel {
     @NotNull(message = "Product ID cannot be null")
     private int productID;
     @NotNull(message ="")
     private String coinType;
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getCoinType() {
		return coinType;
	}
	public void setCoins(String coinType) {
		this.coinType = coinType;
	}
}
