package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("cktr")
public abstract class Cricketer {
   
	public Cricketer() {
		System.out.println("Cricketer::0-param constractor()"+this.getClass());
	}
	
	//@Lookup("cBat")
	@Lookup
	public abstract CricketBat getBat();
	
	//special method
	public String batting() {
		//get Dependent class object (internally uses the IOC container dependency lookup code of Proxy class)
		CricketBat bat = getBat();
		//use the dependency object
		int runs = bat.scoreRuns();
		
		return "Cricketer is batting on :: "+runs;
	}
	
	public String bowling() {
		return "Crickter is bowling";
	}
	
	public String wicketKeeing() {
		return "Crickter is keeping the wickets";
	}

	public String fileding() {
		return "Crickter is fielding the ball";
	}
}
