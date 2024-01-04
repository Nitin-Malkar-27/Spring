package com.nt.singleton;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
@Lazy(true)
public class WishMessageGenerator {

	//HAS-A property
	@Autowired
	//@Qualifier("ldt")
	private LocalDateTime dateTime;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	
	//b.method
	public String showWishMessage(String msg) {
		System.out.println("WishMessageGenerator.showWishMessage()");
		System.out.println("dateTime::"+dateTime);
		//get current hour of day
		int hour = dateTime.getHour();
		//generate the wish message
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<20)
			return "Good Evening";
		else
			return "Good Night";
		
	}

}
