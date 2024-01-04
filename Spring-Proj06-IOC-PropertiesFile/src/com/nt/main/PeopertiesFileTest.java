package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.PersonInfo;
import com.nt.sbeans.PersonalInfo1;

public class PeopertiesFileTest {

	public static void main(String[] args) {

		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		// get spring bean class obj
		PersonInfo info = ctx.getBean("pInfo", PersonInfo.class);
		System.out.println(info);

		System.out.println("===============================================");
		PersonalInfo1 info1 = ctx.getBean("pInfo1", PersonalInfo1.class);
		System.out.println(info1.toString());

		System.out.println("===============================================");
		Environment env = ctx.getEnvironment();
		System.out.println("name ::" + env.getProperty("per.name") + "  " + env.getProperty("per.age") + "\n"
				+ "os.name ::" + env.getProperty("os.name") + "\n Path Data ::" + env.getProperty("Path"));

		// close container
		ctx.close();

	}

}
