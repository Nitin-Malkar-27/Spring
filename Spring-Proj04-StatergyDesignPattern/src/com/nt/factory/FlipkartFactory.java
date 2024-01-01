package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

//FlipkartFactory.java (Factory pattern class)
public class FlipkartFactory {
	
	//static factory method having factory pattern logic
	public static Flipkart getInstance(String courierType) {

		//create depedent class obj
		Courier courier = null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("blueDert"))
			courier=new BlueDart();
		else 
			throw new IllegalArgumentException("Invalid courier type");
		
		//create target class object
		Flipkart fpkt = new Flipkart();
		//assign dependent class object to target class object
		fpkt.setCourier(courier);
		
		return fpkt;
	}

}
