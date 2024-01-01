package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("SetterInjectionTest.main()(start)");
		// create IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nt/cfgs/applicationContext.xml");
		
		// get target spring bean obj
		Object obj = ctx.getBean("wmg");
		// typecasting
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		// invoke the b.method
		String result = generator.showWishMessage("raja");
		System.out.println(result);

		// close container
		ctx.close();

		System.out.println("SetterInjectionTest.main()(end)");
	}
}
