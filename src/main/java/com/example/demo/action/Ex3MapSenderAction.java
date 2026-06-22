package com.example.demo.action;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.demo.service.OrderDynamicSender;

//@Component
public class Ex3MapSenderAction implements CommandLineRunner{
	private final OrderDynamicSender orderDynamicSender;
	
	public Ex3MapSenderAction(OrderDynamicSender orderDynamicSender) {
		this.orderDynamicSender = orderDynamicSender;
	}

	@Override
	public void run(String... args) throws Exception {
		orderDynamicSender.placeHolder("lineService", "冰箱");
	}
}
