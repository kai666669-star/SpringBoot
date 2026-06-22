package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class OrderServiceDI {
	
//	@Autowired
	private SendMsgService sendMsgService;
	
    public OrderServiceDI(@Qualifier("lineService")SendMsgService sendMsgService) {
    	this.sendMsgService = sendMsgService;
    }
    //Qualifier的()裡面要加的是bean的物件名稱的開頭小寫 注意要為小寫開頭!!
    
	
	public void checkoutOrder(String item) {
		System.out.println("訂單成立: " + item);
		sendMsgService.sendMessages("訂單成立: "+ item);
	}


}
