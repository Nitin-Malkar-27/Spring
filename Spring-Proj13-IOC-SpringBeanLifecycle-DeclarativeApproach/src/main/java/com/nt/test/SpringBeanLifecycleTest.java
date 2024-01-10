package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotingEligiblityCheck;

public class SpringBeanLifecycleTest {

	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("________________________");
		
		//get spring bean class object
		VotingEligiblityCheck vec = ctx.getBean("vec",VotingEligiblityCheck.class);
		
		try {
			//invoke the b.method
			String result = vec.checkVotingEligibility();
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("___________________");
		//close the container
		ctx.close();
	}

}
