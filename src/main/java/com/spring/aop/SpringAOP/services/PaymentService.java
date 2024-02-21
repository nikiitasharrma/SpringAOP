package com.spring.aop.SpringAOP.services;

public class PaymentService {
	
	public void makePayment(int amount) {
		
		/**
		 * Payment Gateway code
		 */
		
		System.out.println("Rs. " +amount + " Amount debited!");
	}
}
