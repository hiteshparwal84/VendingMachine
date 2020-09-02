package com.vendormachine;

import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vendormachine.DelloliteVmApplication;
import com.vendormachine.controller.VMController;
import com.vendormachine.exceptions.CustomException;
import com.vendormachine.model.Product;
import com.vendormachine.model.ProductAndChangeDispatcher;
import com.vendormachine.model.UserOrderModel;
import com.vendormachine.services.VendorMachineService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DelloliteVmApplication.class)
public class DelloliteVmApplicationTests {

	@Autowired
	VendorMachineService service;

	@Test
	public void contextLoads() {
	}

	@Test
	public void UseMachine() throws CustomException {
		List<Product> list = service.getMenu();

		System.out.println("Product Details");
		System.out.println("-------------------------------------------------");
		for (Product p : list) {
			System.out.println("Item: " + p.getProductName() + "\n" + "Price: " + p.getCoinType() + "\n" + "Product No: " + p.getProductID());
			System.out.println("------------------------------------------------------");
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product id");
		int productID = sc.nextInt();
		System.out.println("Enter coin type");
		String coinsType = sc.next();

		UserOrderModel order = new UserOrderModel();
		order.setCoins(coinsType);
		order.setProductID(productID);
		ProductAndChangeDispatcher pro = service.processOrder(order);

		System.out.println("Collect your Order");
		System.out.println("Product: " + pro.getDispatchProduct());
		System.out.println("Remaning Change :" + pro.getChange());

		sc.close();

	}

}
