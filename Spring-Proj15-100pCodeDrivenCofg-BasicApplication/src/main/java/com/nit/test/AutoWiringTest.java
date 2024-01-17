package com.nit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.WishMessageGenerator;

public class AutoWiringTest {

	public static void main(String[] args) {
		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("_________________________");
		// get spring bean class object ref
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println("_________________________");
		// invoke the b.method
		String resultMsg = generator.generateWishMessage("Raja");
		System.out.println(resultMsg);
		System.out.println("_________________________");

		// close the container
		ctx.close();

	}

}
