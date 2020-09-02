package com.vendormachine.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vendormachine.exceptions.CustomException;
import com.vendormachine.model.Product;
import com.vendormachine.model.ProductAndChangeDispatcher;
import com.vendormachine.model.UserOrderModel;
import com.vendormachine.services.VendorMachineService;


@RestController
@RequestMapping("/vendor-machine")
public class VMController {
	
	@Autowired
	VendorMachineService vms;

	@GetMapping("/show-menu")
	public List<Product> showMenu() {
		return vms.getMenu();
	}

	@PostMapping("/order-item")
	@ResponseBody
	public ResponseEntity<ProductAndChangeDispatcher> takeOrderRequest(@Valid @RequestBody UserOrderModel order) throws CustomException {
        return  ResponseEntity.status(HttpStatus.OK).body(vms.processOrder(order));
	}

}
