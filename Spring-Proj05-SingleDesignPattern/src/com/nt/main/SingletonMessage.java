package com.nt.main;

import java.time.LocalDateTime;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.singleton.WishMessageGenerator;

public class SingletonMessage {

	public static void main(String[] args) {
		
		//create IOC container 
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get target Spring bean class object
		WishMessageGenerator generator1 = ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator2 = ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator1.hashCode()+" "+generator2.hashCode()); //gives same hashcode
		System.out.println(("generator1==generator2"+(generator1==generator2))); //return true
		
		//invoke the b.method
		String result = generator1.showWishMessage("raja");
		String result1 = generator2.showWishMessage("raja");

		System.out.println("=========================");

		LocalDateTime dt1 = ctx.getBean("ldt", LocalDateTime.class);
		LocalDateTime dt2 = ctx.getBean("ldt", LocalDateTime.class);
		System.out.println(dt1.hashCode() + " " + dt2.hashCode());
		System.out.println("(dt1==dt2)" + (dt1 == dt2));

		/*
		 * System.out.println("--------------------------------------");
		 * 
		 * LocalDateTime dt3 = ctx.getBean("ldt", LocalDateTime.class); LocalDateTime
		 * dt4 = ctx.getBean("ldt", LocalDateTime.class);
		 * System.out.println(dt3.hashCode() + " " + dt4.hashCode());
		 * System.out.println("(dt1==dt2)" + (dt3 == dt4));
		 */
	}

	
}
