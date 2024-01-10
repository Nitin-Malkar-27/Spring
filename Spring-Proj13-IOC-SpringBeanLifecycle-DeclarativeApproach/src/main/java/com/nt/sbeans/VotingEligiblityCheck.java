//VotingEligiblilityCheck.java
package com.nt.sbeans;

import java.util.Date;

public class VotingEligiblityCheck {
	// spring bean properties
	private String name;
	private int age;
	private Date varifiedOn;

	public VotingEligiblityCheck() {
		System.out.println("VotingEligilbilityCheck:: 0-param constractor");
	}

	public void setName(String name) {
		System.out.println("VotingEligilbilityCheck.setName()");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("VotingEligilbilityCheck.setAge()");
		this.age = age;
	}

	public void setVarifiedOn(Date varifiedOn) {
		System.out.println("VotingEligilbilityCheck.setVarifiedOn()");
		this.varifiedOn = varifiedOn;
	}

	public String checkVotingEligibility() {
		System.out.println("VotingEligilbilityCheck.checkVotingEligibility()");
		if (age < 18) {
			return "Mr/Mrs/Miss " + name + " you are not eligible for voiting on date " + varifiedOn;
		} else {
			return "Mr/Mrs/Miss " + name + " you are Welcome for voiting on date " + varifiedOn;
		}
	}

	public void myInit() {
		System.out.println("VotingEligilbilityCheck.myInit()");
		// initialize the left over properties
		varifiedOn = new Date();
		// check whether important are cfgs with correct value or not
		if (name == null || name.trim().length()==0 || age <= 0) {
			throw new IllegalArgumentException("Invalid values are injected for spring bean porperties(name, age)");
		}
	}
	
	public void myDestroy() {
		System.out.println("VotingEligilbilityCheck.myDestroy()");
		//nullify the Spring bean properties
		name = null;
		age = 0;
	}

}
