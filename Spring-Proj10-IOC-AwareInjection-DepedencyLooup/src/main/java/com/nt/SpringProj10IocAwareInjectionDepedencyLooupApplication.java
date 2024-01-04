package com.nt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class SpringProj10IocAwareInjectionDepedencyLooupApplication {

	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("--------------------------------");
		// get target spring bean class object
		Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
		// invoke the b.methods
		System.out.println(cktr.bowling());
		System.out.println(cktr.fileding());
		System.out.println(cktr.wicketKeeing());
		System.out.println("--------------------------------");
		System.out.println(cktr.batting());
	}

}
