package com.ryf.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * spring aop的演示
 * @author Administrator
 *
 */

@Aspect
public class ControllerAop {
	
	public void before(){
		System.out.println("前置通知");
	}
	
	public void afterReturning (){
		System.out.println("后置通知");
	}
	
	public void around(){
		System.out.println("环绕通知");
	}
	
	@AfterReturning(pointcut="execution(* com.ryf.controller.*.*(..))")
	public void test(){
		System.out.println("注解实现aop后置通知");
	}
	
}
