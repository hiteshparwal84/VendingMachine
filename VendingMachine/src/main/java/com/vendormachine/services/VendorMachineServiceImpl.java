package com.vendormachine.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Component;

import com.vendormachine.exceptions.CustomException;
import com.vendormachine.model.Product;
import com.vendormachine.model.ProductAndChangeDispatcher;
import com.vendormachine.model.UserOrderModel;

@Component
public class VendorMachineServiceImpl implements VendorMachineService {
	
	
	ProductsService ps = new ProductsService();
	
	public List<Product> getMenu(){
	    	return ps.getAllProductsDetails();
	}
	
	public ProductAndChangeDispatcher processOrder(UserOrderModel orderDetails) throws CustomException {
		int coinValue = CoinsService.getCoinValue(orderDetails.getCoinType());
		Product item = ProductsService.getProductDetails(orderDetails.getProductID()) ;
		List<String> change = new ArrayList<>();
		try {
			if(item == null)
				throw new CustomException("No such product found");
			
			int quantity =item.getQuantity();
			if(quantity < 1)
				throw new CustomException("Oops All Sold out!!");
			
			int itemPrice = CoinsService.getCoinValue(item.getCoinType());
			if(coinValue < itemPrice)
				throw new CustomException("Insufficient Amount");
			
			
			int diff = coinValue - itemPrice;
			boolean temp;
			if(diff !=0) {
				int fifty = diff/50;
				temp = fifty !=0 ? change.add(CoinsService.getCoinKey(50)+"= "+fifty+" Coin") : false;
				diff = diff - (fifty*50);
				
				int twenty = diff/20;
				temp = twenty !=0 ? change.add(CoinsService.getCoinKey(20)+"= "+twenty+" Coin") : false;
				diff = diff - (twenty * 20);
				
				int ten = diff/10;
				temp = ten !=0 ? change.add(CoinsService.getCoinKey(10)+"= "+ten+" Coin") : false;
				diff = diff - (ten*10);
				
			}else
				change.add("0");
			
		
		}catch(Exception exp ) {
			
			throw exp;
		}
		
		return new ProductAndChangeDispatcher(item.getProductName() , change);
	}
	
	
	
	
}
