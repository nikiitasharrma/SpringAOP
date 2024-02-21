package com.spring.aop.SpringAOP.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.spring.aop.SpringAOP.services.PaymentService.makePayment(..))")
	public void beforePayment() {
		System.out.println("Payment process started...");
	}
	
	@After("execution(* com.spring.aop.SpringAOP.services.PaymentService.makePayment(..))")
	public void afterPayment() {
		System.out.println("Payment process completed...");
	}

}
