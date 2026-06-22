package com.example.demo.service;

 
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class OrderDynamicSender {
	private final Map<String , SendMsgService> senders;
	public OrderDynamicSender(Map<String , SendMsgService> senders) {
		this.senders = senders;
	}
	public void placeHolder(String sender , String item) {
		SendMsgService sendService = senders.get(sender);
		sendService.sendMessages("訂購: "+ item);
	}

}
