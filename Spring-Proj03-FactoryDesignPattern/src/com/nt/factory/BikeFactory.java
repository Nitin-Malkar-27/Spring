package com.nt.factory;

import com.nt.comps.Bike;
import com.nt.comps.BulletBike;
import com.nt.comps.ElectricBike;
import com.nt.comps.SportBike;
import com.nt.comps.StanderdBike;

public class BikeFactory {

	//static factory method having factory pattern logic

	public static Bike orderbike(String type) {
		Bike bike = null;
		if (type.equalsIgnoreCase("bullet"))
			bike = new BulletBike();
		else if (type.equalsIgnoreCase("electric"))
			bike = new ElectricBike();
		else if (type.equalsIgnoreCase("sport"))
			bike = new SportBike();
		else if (type.equalsIgnoreCase("standerd"))
			bike = new StanderdBike();
		else
			throw new IllegalArgumentException("Invalid Bike Type");

		return bike;

	}
}
