package com.nt.comps;

//DTDC.java (dependent class1)
public final class DTDC implements Courier{

	@Override
	public String deliver(int oid) {

		return oid+" order item are kept for delivery by DTDC";
	}

}
