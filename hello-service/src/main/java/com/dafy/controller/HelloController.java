package com.dafy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dafy.service.HelloService;

@RestController
public class HelloController {

	
	@Autowired
	HelloService helloService;
	
	
	@RequestMapping("/hello")
	public String hello() {
		return helloService.hello("key");
	}
	
	@RequestMapping("/cal")
	public int math(int val) {
		return helloService.computePiDecimal(val);
	}
}
