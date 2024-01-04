package com.nt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get target spring bean object
		Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
		// invoke the business methods
		System.out.println(cktr.bowling());
		System.out.println(cktr.filding());
		System.out.println(cktr.wicketKipping());
		System.out.println("------------------");
		System.out.println(cktr.batting());

	}

}
