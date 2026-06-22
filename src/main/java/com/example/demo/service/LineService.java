package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class LineService implements SendMsgService {
	
	public void sendMessages(String messages) {
		System.out.println("Line傳送: " + messages);
	}


}
