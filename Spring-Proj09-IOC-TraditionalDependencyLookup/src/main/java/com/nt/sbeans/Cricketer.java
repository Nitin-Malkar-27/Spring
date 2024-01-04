package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@Lazy(true)
public class Cricketer {

	public Cricketer() {
		System.out.println("Cricketer:: 0-param constractor");
	}

	public String batting() {
		// create additional IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get dependent spring bean class object(Dependency lookup)
		CricketBat bat = ctx.getBean("cBat", CricketBat.class);
		// use the dependent object
		int runs = bat.scoreRuns();

		return "crickter is Batting on :: " + runs;
	}

	public String bowling() {

		return "Cricter is bowling";
	}

	public String wicketKipping() {

		return "Crickter is wicketWipping";
	}

	public String filding() {
		return "Crickter is filding";
	}
}
