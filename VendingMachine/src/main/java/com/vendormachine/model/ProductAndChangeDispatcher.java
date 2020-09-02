package com.vendormachine.model;

import java.util.List;

public class ProductAndChangeDispatcher {
	String dispatchProduct;
	List<String> change;

	public ProductAndChangeDispatcher(String dispatchProduct, List<String> change) {
		this.dispatchProduct = dispatchProduct;
		this.change = change;
	}

	public ProductAndChangeDispatcher() {
		super();
	}

	public String getDispatchProduct() {
		return dispatchProduct;
	}

	public void setDispatchProduct(String dispatchProduct) {
		this.dispatchProduct = dispatchProduct;
	}

	public List<String> getChange() {
		return change;
	}

	public void setChange(List<String> change) {
		this.change = change;
	}

}
