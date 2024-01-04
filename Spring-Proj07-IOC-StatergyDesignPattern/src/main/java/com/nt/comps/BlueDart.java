package com.nt.comps;

//BlueDart.java (dependent class2)
public final class BlueDart implements Courier{

	@Override
	public String deliver(int oid) {

		return oid+" order item are kept from delivery by BlueDart";
	}

	
}
