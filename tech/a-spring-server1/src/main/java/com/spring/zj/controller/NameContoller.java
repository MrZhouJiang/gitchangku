package com.spring.zj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("name")
public class NameContoller {
	
	
	@RequestMapping("/say")
	public String sayName(@RequestParam String name){
		return"hllow zhou "+ name;
	}
	

}
