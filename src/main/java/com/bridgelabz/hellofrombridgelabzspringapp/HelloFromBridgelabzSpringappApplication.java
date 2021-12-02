package com.bridgelabz.hellofrombridgelabzspringapp;

import com.bridgelabz.hellofrombridgelabzspringapp.component.EmployeeBean;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Purpose : Simulate SpringBoot application invoking welcome message usng slf4j logger expression
 *
 * @author : Sampriti Roy Chowdhury
 * @version : 0.0.1
 * @since : 1-12-2021
 */

@SpringBootApplication
@Slf4j
public class HelloFromBridgelabzSpringappApplication {

	public static final Logger logger = LoggerFactory.getLogger(HelloFromBridgelabzSpringappApplication.class);

	public static void main(String[] args) {
		//System.out.println("Hello from Bridgelabz");
		logger.debug("Hello World!!");
		ApplicationContext context = SpringApplication.run(HelloFromBridgelabzSpringappApplication.class, args);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(111);
		employeeBean.setEname("Sampriti Roy Chowdhury");
		employeeBean.showEmployeeDetails();
	}

}
