package com.nt.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("cBat")
public class CricketBat {

	public CricketBat() {
		System.out.println("CricketBat.CricketBat()");
	}

	public int scoreRuns() {
		return new Random().nextInt(120);
	}

}
