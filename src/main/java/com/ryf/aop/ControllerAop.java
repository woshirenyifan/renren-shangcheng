package com.ryf.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

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
	public void test(JoinPoint point){
		System.out.println("注解实现aop后置通知开始...");
		
		
		
		
		Signature signature = point.getSignature();
		MethodSignature methodSignature = (MethodSignature)signature;
		
		String declaringTypeName = signature.getDeclaringTypeName();// 类名
		String methodName = signature.getName();// 方法名
		Class[] paramClassName = methodSignature.getParameterTypes();// 参数类型数组
		String[] parameterNames = methodSignature.getParameterNames();// 参数名数组
		Object[] parameterVals = point.getArgs();// 参数值数组
		
		/**
		 	className:com.ryf.controller.HelloController
			methodName:selectTCBytno
			paramClassName:[class java.lang.String]
			parameterNames:[tno]
			parameterValues:[825]
		 */
		System.out.println("className:" + declaringTypeName);// 类名
		System.out.println("methodName:" + methodName);// 方法名
		System.out.println("paramClassName:" + Arrays.toString(paramClassName));// 参数类型
		System.out.println("parameterNames:" + Arrays.toString(parameterNames));// 参数名
		System.out.println("parameterValues:" + Arrays.toString(parameterVals));// 参数值
		
		System.out.println("注解实现aop后置通知结束...");
		
		
	}
	
}
