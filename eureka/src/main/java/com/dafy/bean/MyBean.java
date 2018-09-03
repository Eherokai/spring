package com.dafy.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Order(1)
@Component
public class MyBean implements CommandLineRunner, InitializingBean,DisposableBean{

	@Value("${spring.application.name}")
	public String name;
	
	@Override
	public void run(String... args) throws Exception {
		//execute after springapplication start
		System.out.println("--------------------"+name);
	}
	
	/*@PreDestroy
	public void destory() {
		
	}
	
	@PostConstruct
	public void postConstruct() {
		
	}*/

	@Override
	public void destroy() throws Exception {
		//execute before destory
		System.out.println("I'm  init  method  using implements DisposableBean interface....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//execute after properties has bean set
		System.out.println("I'm  init  method  using implements InitializingBean interface....");
	}
}
