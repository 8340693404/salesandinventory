package com.sales_and_inventory_Genericutility;

import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		return randomNumber;
	}

}
