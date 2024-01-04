package com.nt.sbeans;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("cBat")
@Lazy(true)
public class CricketBat {

	public CricketBat() {
		System.out.println("CricketBat.CricketBat()");
	}

	public int scoreRuns() {

		return new Random().nextInt(100);
	}

}
