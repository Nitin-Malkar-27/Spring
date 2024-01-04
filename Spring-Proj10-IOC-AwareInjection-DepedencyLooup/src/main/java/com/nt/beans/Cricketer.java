package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("cktr")
public class Cricketer implements ApplicationContextAware{
    private ApplicationContext ctx;
    
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext(-)");
		this.ctx = ctx;
	}
	
	public Cricketer() {
		System.out.println("Cricketer::0-param constractor()");
	}
	
	public String batting() {
		//get Depedent spring bean class object (Depedency looup)
		CricketBat bat = ctx.getBean("cBat",CricketBat.class);
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
