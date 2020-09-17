package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Product;
import com.app.config.AppConfig;

public class Test {

	
	public static void main(String[] args) {
		ApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);
		Product p=(Product)ac.getBean("prodObj");
		System.out.println(p.toString());
		
	}
}
