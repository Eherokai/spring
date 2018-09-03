package com.dafy.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dafy.filter.HelloFilter;
import com.dafy.filter.WorldFilter;

@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean<HelloFilter> helloFilter() {
		FilterRegistrationBean<HelloFilter> filterRegistrationBean = new FilterRegistrationBean<HelloFilter>(); 
		filterRegistrationBean.setFilter(new HelloFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("paramName", "hello");
		filterRegistrationBean.setName("helloFilter");
		filterRegistrationBean.setOrder(6);
		return filterRegistrationBean;
	}
	
	@Bean
	public FilterRegistrationBean<WorldFilter> worldFilter() {
		FilterRegistrationBean<WorldFilter> filterRegistrationBean = new FilterRegistrationBean<WorldFilter>(); 
		filterRegistrationBean.setFilter(new WorldFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("paramName", "world");
		filterRegistrationBean.setName("worldFilter");
		filterRegistrationBean.setOrder(5);
		return filterRegistrationBean;
	}
}