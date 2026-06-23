package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer level;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Integer getLevel() {
//		return level;
//	}
//	public void setLevel(Integer level) {
//		this.level = level;
//	}
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Customer [id=");
//		builder.append(id);
//		builder.append(", name=");
//		builder.append(name);
//		builder.append(", level=");
//		builder.append(level);
//		builder.append("]");
//		return builder.toString();
//	}
	
	
	
	
	

}
