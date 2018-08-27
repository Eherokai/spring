package com.dafy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.dafy.listener.ApplicationListenerEnvironmentPrepared;
import com.dafy.listener.ApplicationListenerFailed;
import com.dafy.listener.ApplicationListenerPrepared;
import com.dafy.listener.ApplicationListenerStarted;

@SpringBootApplication
@EnableEurekaServer
public class InitialApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run(InitialApplication.class, args);
		
		
		
		/**
		 * 硬编码注册Listener
		 */
		SpringApplication application = new SpringApplication(InitialApplication.class);
		application.addListeners(
				new ApplicationListenerEnvironmentPrepared(),
				new ApplicationListenerFailed(),
				new ApplicationListenerPrepared(),
				new ApplicationListenerStarted()
				);
		application.run(args);

	}
	
}
