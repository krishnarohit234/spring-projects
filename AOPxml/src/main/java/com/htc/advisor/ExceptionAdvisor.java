package com.htc.advisor;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvisor implements ThrowsAdvice {

	public void afterThrowing(Exception e) {
		System.out.println("If exception occurs this methode is called");
	}
}
