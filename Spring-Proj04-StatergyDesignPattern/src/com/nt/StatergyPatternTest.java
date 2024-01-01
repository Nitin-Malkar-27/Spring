package com.nt;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StatergyPatternTest {

	public static void main(String[] args) {

		//use factory pattern to target class object
		Flipkart fpkt = FlipkartFactory.getInstance("blueDert");
		//Flipkart fpkt = FlipkartFactory.getInstance("dtdc");
		//Flipkart fpkt = FlipkartFactory.getInstance("abc");
		
		//invoke the business method
		String resultMsg = fpkt.shopping(new String[] {"shirt", "trouser"},
				                              new double[] {5000.0, 6000.0});
		
		System.out.println(resultMsg);
		
	}

}
