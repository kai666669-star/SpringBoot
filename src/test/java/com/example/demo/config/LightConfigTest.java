package com.example.demo.config;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LightConfigTest {
	
	@Autowired
	private LightConfig lightConfig;
	
	@Test
	public void test1() {
		
		assertAll(
				() -> assertEquals(1001, lightConfig.getLightId()),
				() -> assertEquals(20, lightConfig.getRedLight()),
				() -> assertEquals(60, lightConfig.getGreenLight()),
				() -> assertEquals(3, lightConfig.getYellowLight()),
				() -> assertEquals("ok66", lightConfig.getApikey()),
				() -> assertEquals(6, lightConfig.getVacation())
				);

	}
}
