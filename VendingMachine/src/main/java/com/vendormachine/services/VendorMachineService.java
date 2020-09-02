package com.vendormachine.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vendormachine.exceptions.CustomException;
import com.vendormachine.model.Product;
import com.vendormachine.model.ProductAndChangeDispatcher;
import com.vendormachine.model.UserOrderModel;

@Service
public interface VendorMachineService {
	List<Product> getMenu();
	ProductAndChangeDispatcher processOrder(UserOrderModel orderDetails) throws CustomException;
   
}
