package com.example.demo.action;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.example.demo.service.OrderSendAllMessageService;


//@Component
public class Ex2SendAllMessages implements CommandLineRunner {


	private OrderSendAllMessageService orderSendAllMessageService;
	
	public Ex2SendAllMessages(OrderSendAllMessageService orderSendAllMessageService) {
		this.orderSendAllMessageService = orderSendAllMessageService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		orderSendAllMessageService.sendAll("四季春");
	}
	
	


}
