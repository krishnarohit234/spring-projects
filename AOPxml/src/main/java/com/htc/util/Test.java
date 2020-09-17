package com.htc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.advisor.ExceptionAdvisor;
import com.htc.service.UserServiceImpl;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserServiceImpl userServiceImplConcrete= (UserServiceImpl)context.getBean("userService");
	//	userServiceImplConcrete.addUser();
		
		System.out.println("Proxy Implementation Running");
		
		UserServiceImpl userServiceImplProxy=(UserServiceImpl)context.getBean("proxy");
	//	userServiceImplProxy.addUser();
		
		UserServiceImpl userServiceImplProxy1=(UserServiceImpl)context.getBean("proxy2");
		userServiceImplProxy1.addUser();
		

		
		
		
	}

}
