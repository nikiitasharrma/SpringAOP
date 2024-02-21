package com.spring.aop.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.SpringAOP.services.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/SpringAOP/config.xml");
        
        PaymentService payment = context.getBean("payment", PaymentService.class);
        
        payment.makePayment(12000);
    }
}
