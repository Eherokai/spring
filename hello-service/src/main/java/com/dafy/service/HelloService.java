package com.dafy.service;

import javax.validation.constraints.Size;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class HelloService {

	public String hello(@Size(min = 8, max = 10) String str) {
		return "Hello World!";
	}
	
	
	@Cacheable("piDecimals")
	public int computePiDecimal(int i) {
		System.out.println("Caculate piDecimals");
		return 2*i;
	}
}
