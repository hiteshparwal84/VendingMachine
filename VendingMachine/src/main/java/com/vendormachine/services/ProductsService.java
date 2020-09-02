package com.vendormachine.services;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;

import com.vendormachine.model.Product;


public class ProductsService{
     static HashMap<Integer , Product> products = new HashMap<>();
     
     static {
    	 products.put(101, new Product("Choclates" , "nickle" , 101 , 10));   // new Product(productName, ProductPrice, ProductCode. productQuantity)
    	 products.put(102, new Product("Candy" , "dime" , 102 , 15));
    	 products.put(103, new Product("Softy" , "dime" , 103 , 8));
    	 products.put(104, new Product("Cold-drink" , "quarter" , 104 , 9));
    	 products.put(105, new Product("Cold-drink and Chips" , "cent" , 105 , 10));
     }
     
	public static Product getProductDetails(int productID) {
    	 return products.get(productID);
     } 
	
	public List<Product> getAllProductsDetails(){
		  List<Product> allProduct = new ArrayList<>();
		  products.forEach((k, v) -> allProduct.add(v));
           return allProduct;
        } 
		
	}
     

