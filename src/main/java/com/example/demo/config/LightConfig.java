package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.Data;

@Data
@Component
@PropertySource("classpath:light.properties")
public class LightConfig {

	@Value("${id}")
	private Integer lightId;

	@Value("${red}")
	private Integer redLight;

	@Value("${green}")
	private Integer greenLight;

	@Value("${yellow}")
	private Integer yellowLight;

	@Value("${apikey}")
	private String apikey;

	private Integer vacation;

	@PostConstruct
	public void init() {
		vacation = 6;
	}

	@PostConstruct
	public void init2() {
		greenLight = 60;
	}

}
