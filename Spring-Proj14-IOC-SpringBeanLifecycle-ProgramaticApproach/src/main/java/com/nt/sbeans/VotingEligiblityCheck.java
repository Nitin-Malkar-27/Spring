//VotingEligiblilityCheck.java
package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vec")
public class VotingEligiblityCheck implements InitializingBean, DisposableBean {

	// spring bean properties
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private int age;
	private Date varifiedOn;

	public VotingEligiblityCheck() {
		System.out.println("VotingEligilbilityCheck:: 0-param constractor");
	}

	public String checkVotingEligibility() {
		System.out.println("VotingEligilbilityCheck.checkVotingEligibility()(Business Method)");
		if (age < 18) {
			return "Mr/Mrs/Miss " + name + " you are not eligible for voiting on date " + varifiedOn;
		} else {
			return "Mr/Mrs/Miss " + name + " you are Welcome for voiting on date " + varifiedOn;
		}
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("VotingEligiblityCheck.destroy()");
		// nullify the Spring bean properties
		name = null;
		age = 0;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VotingEligiblityCheck.afterPropertiesSet()");
		// initialize the left over properties
		varifiedOn = new Date();
		// check whether important are cfgs with correct value or not
		if (name == null || name.trim().length() == 0 || age <= 0) {
			throw new IllegalArgumentException("Invalid values are injected for spring bean porperties(name, age)");
		}
	}

}
