package com.nt;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {

		Bike bike1 = BikeFactory.orderbike("standerd");
		bike1.drive();
		System.out.println("===========================");
		Bike bike2 = BikeFactory.orderbike("sport");
		bike2.drive();
		System.out.println("===========================");
		Bike bike3 = BikeFactory.orderbike("electric");
		bike3.drive();
		System.out.println("===========================");
		Bike bike4 = BikeFactory.orderbike("Bullet");
		bike4.drive();
	}

}
