package com.example.demo.service;


import java.util.List;


import org.springframework.stereotype.Component;


@Component
public class OrderSendAllMessageService {
	
	private final List<SendMsgService> msgServiceList;
	
	public OrderSendAllMessageService(List<SendMsgService> msgServiceList) {
		this.msgServiceList = msgServiceList;
	}
	
	public void sendAll(String msg) {
		for(SendMsgService oneMsgService : msgServiceList) {
			oneMsgService.sendMessages(msg);
		}
	}


}

