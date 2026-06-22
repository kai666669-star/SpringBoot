package com.example.demo.action;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.example.demo.service.OrderServiceDI;


// 實作 CommandLineRunner 的物件，會在 SpringBoot 啟動完後執行一次 run 方法內的程式。


//@Component
public class Ex1IoCAction implements CommandLineRunner {


	private OrderServiceDI orderServiceDI;
	
	public Ex1IoCAction(OrderServiceDI orderServiceDI) {
		this.orderServiceDI = orderServiceDI;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		orderServiceDI.checkoutOrder("紅茶");
		
	}


}
