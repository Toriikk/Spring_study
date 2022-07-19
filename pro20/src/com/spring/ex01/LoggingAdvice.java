package com.spring.ex01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
 

public class LoggingAdvice implements MethodInterceptor{
	public Object invoke (MethodInvocation invocation) throws Throwable {
		System.out.println("[메서드 호출 전 : LoggingAdvice");
		System.out.println(invocation.getMethod() + "메서드 호출 전");
		
		Object object = invocation.proceed(); // 함수를 여러개 지정할 필요없이 한 번만 해도 적용됨??
		
		System.out.println("[메서드 호출 후 : loggingAdvice");
		System.out.println(invocation.getMethod() + "메서드 호출 후");
		
		return object;
		
	}
}
