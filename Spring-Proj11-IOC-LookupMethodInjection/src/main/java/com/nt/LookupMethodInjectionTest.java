package com.nt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class LookupMethodInjectionTest {

	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("-------------------------------------------------------------");
		//get Proxy class object
		Cricketer proxy = ctx.getBean("cktr", Cricketer.class);
		System.out.println(proxy.getClass()+"  --------  "+proxy.getClass().getSuperclass());
		//invoke the b.methods
		System.out.println(proxy.bowling());
        System.out.println(proxy.fileding());
        System.out.println(proxy.wicketKeeing());
        System.out.println("--------------------------------");
        System.out.println(proxy.batting());
        
        //close container
        ctx.close();
	}

}
