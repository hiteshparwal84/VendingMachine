package com.vendormachine.services;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

public class CoinsService {
	static HashMap<String, Integer> acceptedCoin = new HashMap<>();
	static {
		acceptedCoin.put("nickle", 10);
		acceptedCoin.put("dime", 20);
		acceptedCoin.put("quarter", 50);
		acceptedCoin.put("cent", 100);
	}

	public static int getCoinValue(String coinType) {

		return acceptedCoin.get(coinType);
	}

	public static String getCoinKey(int value) {

		String returnCoin = "";
		for (Entry<String, Integer> entry : acceptedCoin.entrySet()) {
			if (entry.getValue() == value) {
				returnCoin = entry.getKey();
			}
		}
		return returnCoin;
	}

}
