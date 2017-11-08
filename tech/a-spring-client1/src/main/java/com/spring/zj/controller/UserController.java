package com.spring.zj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping("/say")
	public String say(@RequestParam String name){
		return this.restTemplate.getForObject
				("http://microservice-server/nama/say?name="+name,String.class );
//		 idea / maven / git / gradle /  spring cloud / 
	}
	
}
