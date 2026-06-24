package com.example.demo.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {
	
	private Integer id;
	
	private String phoneName;
	
	private String brand;

}
