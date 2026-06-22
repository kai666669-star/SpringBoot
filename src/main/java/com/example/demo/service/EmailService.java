package com.example.demo.service;

import org.springframework.stereotype.Component;


@Component
public class EmailService implements SendMsgService {
	public void sendMessages(String messages) {
		System.out.println("Email 傳送: " + messages);
	}


}
