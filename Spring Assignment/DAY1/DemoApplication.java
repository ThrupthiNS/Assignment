package com.sonata.casestudy;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.impl.DefaultGreeting;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {

//		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		//GreetingInterface  greeting = new DefaultGreeting();
		//CallGreetingInterface  greeting = (CallGreetingInterface) ctx.getBean("defaultCallGreeting");
//		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
//		CallGreetingInterface greeting = (CallGreetingInterface) factory.getBean("callgreeting");
//		
//		System.out.println(greeting.callGreeting("Ganesh"));
		
		

			ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
			UseValidationinterface u=(UseValidationinterface) ctx.getBean("defaultUserValidation");
			boolean f=u.validateUser("Thrupthi", "1234");
			
//			System.out.println(u.validateUser("Thrupthi", "1234"));
			if(f==true) 
				System.out.println("login successful");
			else
				System.out.println("Login unsuccessfull");
		
		
	}

}
