package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

//Flipkart.java (target class)
public class Flipkart {

	// HAS-A property
	private Courier courier;

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	// b.method
	public String shopping(String items[], double prices[]) {
		// calculate bill amount
		double billAmount = 0.0;
		for (double p : prices) {
			billAmount = billAmount + p;
		}
		//generate the order id (random number as the order)
		int oid = new Random().nextInt(1000);
		//deliver the products using courier
		String msg = courier.deliver(oid);
		
		
		return Arrays.toString(items)+" items with billAmount :: "
		                                        +billAmount+"....."+msg;
	}
}
