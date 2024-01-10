package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class MethodInjectionTest {

	public static void main(String[] args) {
		//cteate IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get target class object reference 
		BankService service = ctx.getBean("bankService", BankService.class);
        System.out.println(service.getClass()+"  "+service.getClass().getSuperclass());

        //invoke the business method
        double interAmt = service.calculateIntrestAmount(100000,12,2);
        
        //close container
        ctx.close();
	}

}
