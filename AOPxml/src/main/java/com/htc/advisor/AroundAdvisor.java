package com.htc.advisor;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class AroundAdvisor implements org.aopalliance.intercept.MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("Before around invocation..");
		Object object=invocation.proceed();
		System.out.println("After around invocation..");
		return object;
	}

	
	
	

}
