package com.sping.withoutweb;

import com.sping.withoutweb.config.ExecuteI;
import com.sping.withoutweb.config.JavaFxInitializer;
import com.sping.withoutweb.config.ServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WithoutwebApplication   implements ExecuteI {
	@Autowired
	private com.sping.withoutweb.service.service service;
	public static ServiceHandler serviceHandler = new ServiceHandler();

	public static void main(String[] args) {

		SpringApplication.run(WithoutwebApplication.class, args);


	}

	@Override
	public void run(String[] args) {
		saveServices();
		JavaFxInitializer.launch();
	}

	private void saveServices() {
		serviceHandler.setService(service);

	}
}
