package com.spring.zj.controller;


import org.junit.Test;

public class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Test
	public void Say(){
		
		System.out.println(name +": name");
	}
	
}
