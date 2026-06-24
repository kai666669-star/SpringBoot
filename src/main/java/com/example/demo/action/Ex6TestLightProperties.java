package com.example.demo.action;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.config.LightConfig;
import com.example.demo.config.Phone;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class Ex6TestLightProperties implements CommandLineRunner{
	
	private  final LightConfig lightConfig;
	
	private final Phone phone;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(lightConfig);
		
		System.out.println(phone);
	}

}
